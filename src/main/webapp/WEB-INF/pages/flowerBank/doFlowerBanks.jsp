<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<code>
    <h1>List FlowerBanks:</h1>
    ${flowerBanks}
    <tr/>

    <h1>Add Flower:</h1>
    <div>
        <sf:form name="f" method="POST" modelAttribute="flower">
            <fieldset>
                <sf:label path="name">Flower Name: </sf:label>
                <sf:input path="name" id="name"/>
                <p/>
                <sf:label path="price">Flower Price: </sf:label>
                <sf:input path="price" id="price"/>
                <p/>
                <br/>

                <input name="commit" type="submit" value="Add" />
            </fieldset>
        </sf:form>

    </div>
</code>
</body>
</html>
