// Copyright 2021 yuyezhong@gmail.com
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import cfig.utils.EnvironmentVerifier
import org.junit.Test
import org.slf4j.LoggerFactory

class EnvironmentVerifierTest {
    private val envv = EnvironmentVerifier()
    private val log = LoggerFactory.getLogger(EnvironmentVerifier::class.java)

    @Test
    fun getHasDtc() {
        val hasDtc = envv.hasDtc
        log.info("hasDtc = $hasDtc")

    }

    @Test
    fun getHasXz() {
        val hasXz = envv.hasXz
        log.info("hasXz = $hasXz")
    }

    @Test
    fun getGzip() {
        val h = envv.hasGzip
        log.info("hasGzip = $h")
    }

    fun getXzcat() {
        val h = envv.hasXzcat
        log.info("hasXzcat = $h")
    }

    fun getBzcat() {
        val h = envv.hasBzcat
        log.info("hasBzcat = $h")
    }
}
