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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.owa.repository.TrainingRepository;
import com.app.owa.repository.PerformanceAppraisalRepository;
import com.app.owa.repository.OrganizationRepository;
import com.app.owa.repository.EmployeePersonalInfoRepository;
import com.app.owa.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
