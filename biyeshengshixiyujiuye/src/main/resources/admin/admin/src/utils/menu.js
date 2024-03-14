const menu = {
    list() {
        return [
    {
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"班级管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryBanji"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"老师公告类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryGonggaoLaoshi"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"企业公告类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryGonggaoQiye"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"行业管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryQiye"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"实习信息类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryShixi"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"院系管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryYuanxi"
                    }
                ],
                "menu":"基础数据管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"就业信息管理",
                        "menuJump":"列表",
                        "tableName":"jiuye"
                    }
                ],
                "menu":"就业信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"实习信息管理",
                        "menuJump":"列表",
                        "tableName":"shixi"
                    }
                ],
                "menu":"实习信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"老师管理",
                        "menuJump":"列表",
                        "tableName":"laoshi"
                    }
					,
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"老师发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoLaoshi"
                    }
                ],
                "menu":"老师管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"企业管理",
                        "menuJump":"列表",
                        "tableName":"qiye"
                    }
					,
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"企业发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoQiye"
                    }
                ],
                "menu":"企业管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"学生管理",
                        "menuJump":"列表",
                        "tableName":"xuesheng"
                    }
                ],
                "menu":"学生管理"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    }
	,
	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"就业信息管理",
                        "menuJump":"列表",
                        "tableName":"jiuye"
                    }
                ],
                "menu":"就业信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"实习信息管理",
                        "menuJump":"列表",
                        "tableName":"shixi"
                    }
                ],
                "menu":"实习信息管理"
            }
            ,{
                "child":[
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"老师发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoLaoshi"
                    }
                ],
                "menu":"老师发布的公告管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"企业管理",
                        "menuJump":"列表",
                        "tableName":"qiye"
                    }
					,
					{
                        "buttons":[
                            "查看"
                        ],
                        "menu":"企业发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoQiye"
                    }
                ],
                "menu":"企业管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"学生管理",
                        "menuJump":"列表",
                        "tableName":"xuesheng"
                    }
                ],
                "menu":"学生管理"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"老师",
        "tableName":"laoshi"
    }
	,
	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"就业信息管理",
                        "menuJump":"列表",
                        "tableName":"jiuye"
                    }
                ],
                "menu":"就业信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"实习信息管理",
                        "menuJump":"列表",
                        "tableName":"shixi"
                    }
                ],
                "menu":"实习信息管理"
            }
            ,{
                "child":[
					{
                        "buttons":[
                            "查看"
                        ],
                        "menu":"老师发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoLaoshi"
                    }
                ],
                "menu":"老师发布的公告管理"
            }
            ,{
                "child":[
					{
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"企业发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoQiye"
                    }
                ],
                "menu":"企业发布的公告管理"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"企业",
        "tableName":"qiye"
    }
	,
	{
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"就业信息管理",
                        "menuJump":"列表",
                        "tableName":"jiuye"
                    }
                ],
                "menu":"就业信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"实习信息管理",
                        "menuJump":"列表",
                        "tableName":"shixi"
                    }
                ],
                "menu":"实习信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"老师管理",
                        "menuJump":"列表",
                        "tableName":"laoshi"
                    }
					,
					{
                        "buttons":[
                            "查看"
                        ],
                        "menu":"老师发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoLaoshi"
                    }
                ],
                "menu":"老师管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"企业管理",
                        "menuJump":"列表",
                        "tableName":"qiye"
                    }
					,
					{
                        "buttons":[
                            "查看"
                        ],
                        "menu":"企业发布的公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggaoQiye"
                    }
                ],
                "menu":"企业管理"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"学生",
        "tableName":"xuesheng"
    }
]
    }
}
export default menu;
