/*
 * Project: rules
 * Package: de.viadee.rules
 * File   : Rule.java
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
 * <h1>Overview</h1>
 * <p>A {@link Rule} is composed of a name, a premise and a conclusion. Is the premise of a rule fulfilled the
 * conclusion will get implied.</p>
 *
 * <p>Each <code>Rule</code> is required to be {@link Comparable comparable} to other rules so that users of this
 * API can easily create {@link java.util.Set sets} of rules without any duplicate entries.</p>
 *
 * <h1>Caveats</h1>
 * <ul>
 *  <li>No Problems known</li>
 * </ul>
 *
 * <h1>Examples</h1>
 * <ol>
 *  <li>
 *      <p>Check whether a rule would fire inside a given context:</p>
 *      
 * <pre>
 * InferenceContext context = ...;
 * Rule rule = ...;
 * boolean canFire = rule.fires(context);     
 * </pre>
 *
 *  </li>
 *  <li>
 *      <p>Check whether a rule inflicted any state change inside a given context:</p>
 *
 * <pre>
 * InferenceContext context = ...;
 * Rule rule = ...;
 * boolean fired = rule.run(context);
 * </pre>
 *
 *  </li>
 * </ol>
 *
 * <h1>How to help</h1>
 * <ul>
 *  <li>Test the interface and write back about errors, bugs and wishes.</li>
 * </ul>
 * 
 * @author      Sebastian Hoß (sebastian.hoss@viadee.de)
 * @param <T>   The topic of the enclosing rule engine.
 * @since       1.0.0
 */
public interface Rule<T> extends Comparable<Rule<T>> {

    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    // *                                                      METHODS                                                      *
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    /**
     * <p>Runs this rule inside a given context. For that it'll check its premises first and if those
     * are fulfilled, it will run its enclosing conclusion.</p>
     * 
     * @param context   The context to use (<b>may not be <code>null</code></b>).
     * @return          <code>true</code> if this rule did change the state of the given context,
     *                  <code>false</code> otherwise.
     */
    boolean run(InferenceContext<T> context);

    /**
     * <p>Checks whether this rule would fire for a given context.</p>
     * 
     * @param context   The context to check (<b>may not be <code>null</code></b>).
     * @return          <code>true</code> if this rule would fire, <code>false</code> otherwise.
     */
    boolean fires(InferenceContext<T> context);

    /**
     * <p>Returns the human readable name of this rule.</p>
     * 
     * @return  The name of this rule.
     */
    String getName();

}