<#-- @ftlvariable name="food" type="com.raintown.models.Food" -->
<#import "../_base.ftl" as base />
<@base.header>
    <form method="post">
        <label>
            Item Name
            <input type="text" name="item-name" required value="<#if (food)??>${food.itemName}</#if>" />
        </label>
        <label>
            Brand Name
            <input type="text" name="brand-name" required value="<#if (food)??>${food.brandName}</#if>" />
        </label>
        <button type="submit">Save</button>
    </form>
</@base.header>
