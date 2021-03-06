/*
 * Project: viaRules
 * Package: de.viadee.rules
 * File   : Conclusion.java
 * Created: Nov 10, 2010 - 5:55:55 PM
 *
 *
 * Copyright 2010 viadee IT Unternehmensberatung GmbH
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
 *
 */
package de.viadee.rules;

/**
 * <p>A {@link Conclusion} encapsulates the final action a {@link Rule} will trigger once its predicate is
 * fulfilled.</p>
 *
 * <h1>Caveats</h1>
 * <ul>
 *  <li>No Problems known</li>
 * </ul>
 *
 * <h1>Examples</h1>
 * <p>No examples so far - interface is too abstract for that.</p>
 *
 * <h1>How to help</h1>
 * <ul>
 *  <li>Test the interface and write back about errors, bugs and wishes.</li>
 * </ul>
 * 
 * @author      Sebastian Hoß (sebastian.hoss@viadee.de)
 * @param <T>   The topic of the inference process.
 * @since       1.0.0
 */
public interface Conclusion<T> {

    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    // *                                                    METHODS                                                  *
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    /**
     * Applies the encapsulated action on a given target.
     * 
     * @param target    The target itself (<b>may not be <code>null</code></b>).
     * @return          <code>true</code> if the conclusion did change the state of the target,
     *                  <code>false</code> otherwise.
     */
    boolean apply(T target);

}
