<%@ page import="org.cosmosgame.celebrate.Person" %>


<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'name', 'error')} ">
  <label for="name">
    <g:message code="person.name.label" default="Name" />

  </label>
  <g:textField name="name" value="${personInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'dob', 'error')} required">
	<label for="dob">
		<g:message code="person.dob.label" default="Dob" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dob" precision="day"  value="${personInstance?.dob}"  />
</div>



