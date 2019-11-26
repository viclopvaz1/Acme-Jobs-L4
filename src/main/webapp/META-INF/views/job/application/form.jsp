<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>

	<acme:form-textbox code="job.application.form.label.referenceNumber" path="referenceNumber"/>
	<acme:form-textbox code="job.application.form.label.moment" path="moment"/>
	<acme:form-moment code="job.application.form.label.status" path="status"/>
	<acme:form-money code="job.application.form.label.skills" path="skills"/>
	<acme:form-url code="job.application.form.label.qualification" path="qualification"/>
	

  	<acme:form-return code="job.application.form.button.return"/>
</acme:form>