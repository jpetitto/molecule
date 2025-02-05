/*
 * Copyright (C) 2021 Square, Inc.
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
package com.example.molecule

import kotlinx.coroutines.delay
import kotlin.random.Random

class LocalRandomService(private val random: Random) : RandomService {
  constructor(seed: Int) : this(Random(seed))

  override suspend fun get(min: Int, max: Int): Int {
    delay(random.nextLong(500L, 999L))
    return random.nextInt(min, max)
  }
}
