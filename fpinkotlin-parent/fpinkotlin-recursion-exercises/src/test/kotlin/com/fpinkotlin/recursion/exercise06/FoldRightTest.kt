package com.fpinkotlin.recursion.exercise06

import com.fpinkotlin.generators.CharListGenerator
import com.fpinkotlin.generators.IntKListGenerator

import com.fpinkotlin.generators.forAll
import io.kotlintest.specs.StringSpec

class FoldRightTest : StringSpec() {

    init {

        "string" {
            forAll(CharListGenerator(), { (array, list) ->
                string(list) == array.fold("") { s, c -> s + c}
            })
        }
    }

    init {

        "sum" {
            forAll(IntKListGenerator(), { (array, list) ->
                sum(list) == array.fold(0) { s, c -> s + c}
            })
        }
    }
}