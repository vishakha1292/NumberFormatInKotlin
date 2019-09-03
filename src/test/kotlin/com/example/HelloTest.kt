package com.example

import org.junit.Rule
import org.junit.Test
import java.lang.AssertionError
import java.lang.reflect.Executable
import kotlin.test.assertEquals
import org.junit.rules.ExpectedException
import kotlin.test.assertFailsWith
import kotlin.test.assertNull


class HelloTest {
    @Test
    fun cleansNumber() {
        val expectedNumber = "+6103286440"
        val actualNumber = formatPhNumber("0403286440")
        assertEquals(expectedNumber, actualNumber)
    }

    @Test
    fun cleansNumberWithDots() {
        val expectedNumber = "+6155555555"
        val actualNumber = formatPhNumber("+61 455555555")
        assertEquals(expectedNumber, actualNumber)
    }

    @Test
    fun cleansNumber2() {
        val expectedNumber = "+6103286440"
        val actualNumber = formatPhNumber("0403286440")
        assertEquals(expectedNumber, actualNumber)
    }

    @Test
    fun cleansNumber3() {
        val expectedNumber = "+6103286440"
        val actualNumber = formatPhNumber("0403286440")
        assertEquals(expectedNumber, actualNumber)
    }
    @Test
    fun cleansNumber4() {
        val expectedNumber = "+6168467434"
        val actualNumber = formatPhNumber("61468467434")
        assertEquals(expectedNumber, actualNumber)
    }



    @Test
    fun whenNumberisNull() {
        val res = formatPhNumber("")
        assertNull(res)
    }


    @Test
    fun whenDigitsAreMoreThanTen() {
        val res = formatPhNumber("112345678901")
        assertNull(res)
  }

}

