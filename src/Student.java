public class Student {
    /*
     * 这是我的学生类
     */
        //学号
        private String id;
        //姓名
        private String name;
        //年龄
        private String age;
        //居住地
        private String address;

        public Student() {

        }

        public Student(String id, String name, String age, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    }


