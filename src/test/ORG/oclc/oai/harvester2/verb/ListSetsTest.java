/**
 Copyright 2006 OCLC, Online Computer Library Center
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
 http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package test.ORG.oclc.oai.harvester2.verb;

import junit.framework.TestCase;
import ORG.oclc.oai.harvester2.verb.ListSets;

public class ListSetsTest extends TestCase {
    public ListSetsTest(String name) {
	super(name);
    }

    public void test11() {
	try {
	    ListSets listSets = new ListSets("http://scholar.lib.vt.edu/theses/OAI/cgi-bin/index.pl");
	    assertTrue(ListSets.SCHEMA_LOCATION_V1_1_LIST_SETS.equals(listSets.getSchemaLocation()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public void test20() {
	try {
	    ListSets listSets = new ListSets("http://alcme.oclc.org/oaicat/servlet/OAIHandler");
	    assertTrue(ListSets.SCHEMA_LOCATION_V2_0.equals(listSets.getSchemaLocation()));
	    listSets = new ListSets("http://alcme.oclc.org/oaicat/servlet/OAIHandler", "foo");
	    System.out.println(listSets.toString());
	    assertTrue(ListSets.SCHEMA_LOCATION_V2_0.equals(listSets.getSchemaLocation()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
