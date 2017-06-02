package indi.group.his.services.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import indi.group.his.model.WorkInformation;
import indi.group.his.services.impl.WorkInformationServiceImpl;

@Aspect
@Component
public class WorkInformationAspect {
    private static final Logger logger = LoggerFactory.getLogger(WorkInformationServiceImpl.class);
    public WorkInformationAspect() {
    }
    @Pointcut("execution(boolean indi.group.his.services.impl.WorkInformationServiceImpl.*(indi.group.his.model.WorkInformation))")
    public void addModifyDeleteAction(){}
    
    @Pointcut("execution(indi.group.his.model.WorkInformation indi.group.his.services.impl.WorkInformationServiceImpl.*(int))")
    public void getAction(){}
    
    @Before(value = "addModifyDeleteAction()")
    public void showAddModifyDeleteInvokeArgs(JoinPoint joinPoint) {
        logger.debug("[Aspect] --- Function Name : " + joinPoint.getSignature().getName() + " ---- args : " + ((WorkInformation)joinPoint.getArgs()[0]).toString());
    }
    
    @Before(value = "getAction()")
    public void showGetInvokeArgs(JoinPoint joinPoint) {
        logger.debug("[Aspect] " + joinPoint.getSignature().getName() + " args : " + ((Integer)joinPoint.getArgs()[0]).toString());
    }
}
