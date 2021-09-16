/*
 * MIT License
 *
 * Copyright (c) 2021 Daniel Waiguru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package io.compwiz.countrylister.data

import io.compwiz.countrylister.domain.model.CountryDomain

val dummyData = listOf(
    CountryDomain(
        name = "Afghanistan",
        region = "Asia",
        subRegion = "Southern Asia",
        capitalCity = "Kabul",
        alphaCode = "AF",
        population = 27657145,
        imageUrl = "https://restcountries.eu/data/afg.svg"
    ),
    CountryDomain(
        name = "American Samoa",
        region = "Oceania",
        subRegion = "Polynesia",
        capitalCity = "Pago Pago",
        alphaCode = "AS",
        population = 57100,
        imageUrl = "https://restcountries.eu/data/asm.svg"
    ),
)