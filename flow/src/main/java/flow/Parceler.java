/*
 * Copyright 2013 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package flow;

import android.os.Parcelable;

/**
 * Generic interface to wrap and unwrap objects as instances of {@link Parcelable}. This is used
 * with {@link Backstack} to provide a pluggable way of saving the applications screens.
 */
public interface Parceler {
  Parcelable wrap(Object instance);
  Object unwrap(Parcelable parcelable);
}
