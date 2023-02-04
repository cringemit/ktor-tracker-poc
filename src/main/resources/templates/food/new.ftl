<#import "../_base.ftl" as base />
<@base.header>
    <form method="post">
        <label>
            Item Name
            <input type="text" name="item-name" required />
        </label>
        <label>
            Brand Name
            <input type="text" name="brand-name" required />
        </label>
        <button type="submit">Save</button>
    </form>
</@base.header>
