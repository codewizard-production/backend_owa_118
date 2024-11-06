package com.app.owa.function;

import com.app.owa.model.PerformanceAppraisal;
import com.app.owa.model.Organization;
import com.app.owa.model.Training;
import com.app.owa.model.EmployeePersonalInfo;
import com.app.owa.model.EmlpoyeeProfile;




import com.app.owa.enums.EmploymentType;
import com.app.owa.enums.OrgDept;
import com.app.owa.enums.TrainingLevel;
import com.app.owa.enums.OrgBranch;
import com.app.owa.converter.OrgBranchConverter;
import com.app.owa.converter.TrainingLevelConverter;
import com.app.owa.converter.EmploymentTypeConverter;
import com.app.owa.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  