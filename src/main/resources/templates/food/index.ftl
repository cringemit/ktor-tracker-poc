<#-- @ftlvariable name="foods" type="kotlin.collections.List<com.raintown.models.Food>" -->
<#import "../_base.ftl" as base />
<@base.header>
    <h1>Food Database</h1>
    <table>
        <thead>
            <tr>
                <th>Brand Name</th>
                <th>Item Name</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <#list foods as food>
                <tr>
                    <td>${food.brandName}</td>
                    <td>${food.itemName}</td>
                    <td>
                        <a href="food/${food.id}">Show</a>
                        <a href="food/edit/${food.id}">Edit</a>
                    </td>
                </tr>
            </#list>
        </tbody>
    </table>
    <a href="food/new">Add a Food</a>
</@base.header>
