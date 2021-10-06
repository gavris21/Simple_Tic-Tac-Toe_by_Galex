package tictactoe

import java.util.*
import kotlin.math.abs

class Board {
    private val boardList = MutableList(3) { MutableList(3) { ' ' } }
    private var input = ""
    fun fillBoard() {
        val scanner = Scanner(System.`in`)
        print("Enter cells: ")
        input = scanner.next()
        var count = 0
        for (i in 0..2) {
            for (j in 0..2) {
                boardList[i][j] = if (input[count] == '_') ' ' else input[count]
                count++
            }
        }
    }

    fun drawBoard() {
        println("---------")
        for (i in 0..2) {
            print("| ")
            for (j in 0..2) {
                print(boardList[i][j])
                if (j in 0..1) print(" ")
            }
            print(" |")
            println()
        }
        println("---------")
    }

    fun analyze(): Boolean {
        var emptyCells = false
        var threeX = false
        var threeO = false
        var countX = 0
        var countO = 0
        for (list in boardList) {
            // check 3 X horizon
            if (list[0] == 'X' && list[1] == 'X' && list[2] == 'X') threeX = true
            // check 3 O horizon
            if (list[0] == 'O' && list[1] == 'O' && list[2] == 'O') threeO = true
            // count X & O
            for (i in 0..2){
                if (list[i] == 'X') countX++
                if (list[i] == 'O') countO++
            }
        }
        // check empty cells
        emptyCells = !boardList[0].contains(' ') && !boardList[1].contains(' ') && !boardList[2].contains(' ')
        for (i in 0..2) {
            // check 3 X vert
            if (boardList[0][i] == 'X' && boardList[1][i] == 'X' && boardList[2][i]== 'X') threeX = true
            // check 3 O vert
            if (boardList[0][i] == 'O' && boardList[1][i] == 'O' && boardList[2][i]== 'O') threeO = true
        }
        // check 3 X diagonal
        if (boardList[0][0] == 'X' && boardList[1][1] == 'X' && boardList[2][2]== 'X') threeX = true
        if (boardList[0][2] == 'X' && boardList[1][1] == 'X' && boardList[2][0]== 'X') threeX = true
        // check 3 O diagonal
        if (boardList[0][0] == 'O' && boardList[1][1] == 'O' && boardList[2][2]== 'O') threeO = true
        if (boardList[0][2] == 'O' && boardList[1][1] == 'O' && boardList[2][0]== 'O') threeO = true
        // result
        if (threeX && threeO || abs(countX - countO) > 1) println("Impossible") else {
            if (threeX) {
                println("X wins")
                return true
            } else {
                if (threeO) {
                    println("O wins")
                    return true
                } else {
                    if (emptyCells) {
                        println("Draw")
                        return true
                    }
                }
            }
        }
        return false
    }

    fun move(xo: Char) {
        var temp = true
        var i = 0
        var j = 0
        while (temp) {
            val scanner = Scanner(System.`in`)
            print("Enter the coordinates: ")
            val input = scanner.nextLine()
            when {
                // check is digit
                !input[0].isDigit() || !input[2].isDigit() -> {
                    println("You should enter numbers!")
                }
                // check in range 1..3
                input[0].digitToInt() !in 1..3 || input[2].digitToInt() !in 1..3 -> {
                    println("Coordinates should be from 1 to 3!")
                }
                // check is cell occupied
                boardList[input[0].digitToInt() - 1][input[2].digitToInt() - 1] != ' ' -> {
                    println("This cell is occupied! Choose another one!")
                }
                // if checks ok assign values
                input[0].digitToInt() in 1..3 && input[2].digitToInt() in 1..3 -> {
                    temp = false
                    i = input[0].digitToInt()
                    j = input[2].digitToInt()
                }
            }
        }
        // assign user input
        boardList[i - 1][j - 1] = xo
    }
}

fun main() {
    // write your code here
    val board = Board()
    //board.fillBoard()
    board.drawBoard()
    //board.analyze()
    board.move('X')
    board.drawBoard()
    for( i in 0..3) {
        board.move('O')
        board.drawBoard()
        if (board.analyze()) return
        board.move('X')
        board.drawBoard()
        if (board.analyze()) return
    }

    //board.analyze()
}