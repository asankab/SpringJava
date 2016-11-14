setter injection
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean name="customerRepository" 
	  class="com.pluralsite.repository.HibernateCustomerRepositoryImpl" />
	  
<bean name="customerService" class="com.pluralsite.service.CustomerServiceImpl">
	    <property name="customerRepository" ref="customerRepository"></property>
	  </bean>

</beans>

constructor injection
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean name="customerRepository" 
	  class="com.pluralsite.repository.HibernateCustomerRepositoryImpl" />
	  
<bean name="customerService" class="com.pluralsite.service.CustomerServiceImpl">
	    <constructor-arg index="0" ref="customerRepository" />
	  </bean>

</beans>

Autowire constructor
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean name="customerRepository" 
	  class="com.pluralsite.repository.HibernateCustomerRepositoryImpl" />
	  
<bean name="customerService" class="com.pluralsite.service.CustomerServiceImpl" autowire="constructor">
	    <!--<constructor-arg index="0" ref="customerRepository" /> -->
	  </bean>

</beans>
