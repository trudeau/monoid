package org.nnsoft.trudeau.math.monoid;

/*
 *   Copyright 2013 - 2018 The Trudeau Project
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import java.util.Comparator;

/**
 * An {@link OrderedMonoid} is a {@link Monoid} with a total order defined on it.
 *
 * @param <M> the type of the elements in the {@link OrderedMonoid}
 */
public interface OrderedMonoid<M>
    extends Monoid<M>, Comparator<M>
{

}
