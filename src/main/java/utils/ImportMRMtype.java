package utils;

import io.cucumber.java.en.Given;

import static admin.api.MRM.customAPI.MrmTypes.*;

public class ImportMRMtype {
    public static void importMRMtype(String jobTypeName, String workflowName) {
        if (verifyMRMtypePresence(jobTypeName)) {
            deleteMRMType(jobTypeName);
        }
        importMRMType(jobTypeName);
        int dseObjectId = getDSEObjects(jobTypeName);
        assignWorkflowToMRMType(dseObjectId, getWorkflowId(workflowName));
        applyChangesToJMObjectType(dseObjectId);
    }
}
