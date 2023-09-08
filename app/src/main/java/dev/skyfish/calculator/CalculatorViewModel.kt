package dev.skyfish.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dev.skyfish.calculator.domain.ButtonAction

class CalculatorViewModel: ViewModel() {

    var state by mutableStateOf(CalculatorState())

    fun onButton(action: ButtonAction){
        when(action){
            is ButtonAction.Number -> writeNumber(action.number)
            is ButtonAction.Operation -> writeOperation(action.operation)
            is ButtonAction.Equals -> calculate()
            is ButtonAction.Decimal -> addDecimal()
            is ButtonAction.Negation -> negate()
            is ButtonAction.Clear -> clearScreen()
            is ButtonAction.Backspace -> backspace()
        }
    }

    private fun writeNumber(number: Int) {
        val displayNumber: String
        val isFirstNumber = state.operation == null

        if(isFirstNumber){
            displayNumber = state.number1 + newNumber.toString()
        }
    }

    private fun calculate() {
        TODO("Not yet implemented")
    }

    private fun addDecimal() {
        TODO("Not yet implemented")
    }

    private fun negate() {
        TODO("Not yet implemented")
    }

    private fun backspace() {
        TODO("Not yet implemented")
    }


}