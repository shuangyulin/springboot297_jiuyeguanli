const base = {
    get() {
        return {
            url : "http://localhost:8080/biyeshengshixiyujiuye/",
            name: "biyeshengshixiyujiuye",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/biyeshengshixiyujiuye/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "毕业生实习与就业管理系统"
        } 
    }
}
export default base
