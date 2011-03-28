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
import ORG.oclc.oai.harvester2.verb.ListRecords;

public class ListRecordsTest extends TestCase {
    public ListRecordsTest(String name) {
	super(name);
    }

    public void testv11() {
	try {
	    ListRecords listRecords = new ListRecords("http://scholar.lib.vt.edu/theses/OAI/cgi-bin/index.pl", null, null, null, "oai_dc");
	    assertTrue(ListRecords.SCHEMA_LOCATION_V1_1_LIST_RECORDS.equals(listRecords.getSchemaLocation()));
	    String resumptionToken = listRecords.getResumptionToken();
	    System.out.println("resumptionToken=" + resumptionToken);
	    assertTrue(resumptionToken.equals("!!!oai_dc!100"));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    public void testv20() {
	try {
	    ListRecords listRecords = new ListRecords("http://alcme.oclc.org/xtcat/servlet/OAIHandler", null, null, null, "oai_dc");
	    assertTrue(ListRecords.SCHEMA_LOCATION_V2_0.equals(listRecords.getSchemaLocation()));
	    String resumptionToken = listRecords.getResumptionToken();
	    System.out.println("resumptionToken=" + resumptionToken);
	    assertTrue(resumptionToken.startsWith("quick:"));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
