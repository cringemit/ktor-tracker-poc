<#-- @ftlvariable name="foods" type="kotlin.collections.List<com.raintown.models.Food>" -->
<#import "../_base.ftl" as base />
<@base.header>
    <h1>Food Database</h1>
    <table>
        <thead>
            <tr>
                <th>Brand Name</th>
                <th>Item Name</th>
            </tr>
        </thead>
        <tbody>
            <#list foods as food>
                <tr>
                    <td>${food.brandName}</td>
                    <td>${food.itemName}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</@base.header>
