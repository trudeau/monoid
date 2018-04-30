package org.nnsoft.trudeau.math.monoid.primitive;

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

import org.nnsoft.trudeau.math.monoid.OrderedMonoid;

/**
 * The class {@link FloatWeightBaseOperations} provides operations and properties
 * for weights of type {@link Float}.
 */
public class FloatWeightBaseOperations
    implements OrderedMonoid<Float>
{

    private static final long serialVersionUID = 8542498901286671169L;

    /**
     * {@inheritDoc}
     */
    public Float identity()
    {
        return 0.0F;
    }

    /**
     * {@inheritDoc}
     */
    public Float append( Float s1, Float s2 )
    {
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1 + s2;
    }

    /**
     * {@inheritDoc}
     */
    public Float inverse( Float element )
    {
        return -element;
    }

    /**
     * {@inheritDoc}
     */
    public int compare( Float s1, Float s2 )
    {
        return s1.compareTo( s2 );
    }

}
