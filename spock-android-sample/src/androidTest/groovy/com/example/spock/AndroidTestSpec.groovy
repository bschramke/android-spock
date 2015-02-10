/*
 * Copyright (C) 2015 Andrew Reitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.spock

import android.app.Instrumentation
import android.support.test.InstrumentationRegistry
import spock.lang.Specification

class AndroidTestSpec extends Specification {
  Instrumentation instrumentation = InstrumentationRegistry.instrumentation

  def "this should run on Android!"() {
    given:
    def a = 2
    def b = 3

    when:
    def result = a + b

    then:
    result == 5
  }

  def "testing application"() {
    given:
    def application = Instrumentation.newApplication(MyApplication, instrumentation.targetContext)

    expect:
    application != null
    application instanceof MyApplication
  }
}
