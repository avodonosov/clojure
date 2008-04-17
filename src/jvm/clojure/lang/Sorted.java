/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Common Public License 1.0 (http://opensource.org/licenses/cpl.php)
 *   which can be found in the file CPL.TXT at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Apr 15, 2008 */

package clojure.lang;

import java.util.Comparator;

public interface Sorted{
Comparator comparator();

Object entryKey(Object entry);

ISeq seq(boolean ascending);

ISeq seqFrom(Object key, boolean ascending);
}