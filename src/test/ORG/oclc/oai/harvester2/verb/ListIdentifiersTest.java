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
import ORG.oclc.oai.harvester2.verb.ListIdentifiers;

public class ListIdentifiersTest extends TestCase {
    public ListIdentifiersTest(String name) {
	super(name);
    }

    public void testv11() {
	try {
	    ListIdentifiers listIdentifiers = new ListIdentifiers("http://scholar.lib.vt.edu/theses/OAI/cgi-bin/index.pl", null, null, null, "oai_dc");
	    assertTrue(ListIdentifiers.SCHEMA_LOCATION_V1_1_LIST_IDENTIFIERS.equals(listIdentifiers.getSchemaLocation()));
	    String resumptionToken = listIdentifiers.getResumptionToken();
	    System.out.println("resumptionToken=" + resumptionToken);
	    assertTrue(resumptionToken.equals("!!!!100"));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    public void testv20() {
	try {
	    ListIdentifiers listIdentifiers = new ListIdentifiers("http://alcme.oclc.org/xtcat/servlet/OAIHandler", null, null, null, "oai_dc");
	    assertTrue(ListIdentifiers.SCHEMA_LOCATION_V2_0.equals(listIdentifiers.getSchemaLocation()));
	    String resumptionToken = listIdentifiers.getResumptionToken();
	    System.out.println("resumptionToken=" + resumptionToken);
	    assertTrue(resumptionToken.startsWith("quick:"));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
