package com.xieq.spring4.hello.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	//定义一个切入点：带有Action注解的方法将被拦截
	@Pointcut("@annotation(com.xieq.spring4.x.hello.aop.Action)")
	public void annotationPointCut() {
	};

	@After("annotationPointCut()")//使用上面定义的切入点
	public void afterPointCut(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("方法执行之后，注解式拦截：" + action.name());
	}
	
	@Before("execution(* com.xieq.spring4.x.hello.aop.DeptService.*(..))")
	public void beforeMathod(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法执行之前，方法规则拦截："+method.getName());
		
	}
}
