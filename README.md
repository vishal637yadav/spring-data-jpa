# Spring Boot Data-JPA
* Auditable Functionality

## BookInfo API
### 1. API to Save BookInfo 
* METHOD : POST  
* URL    : http://localhost:8085/addBookInfo
* RequestBody : Json

        {
            "userId":"Rajesh Khanna",
            "employee": {
                            "name":"You can Do",
                            "authors":"yes  ",
                            "totalPageCount": 150
                        }
        }


### 2. API to Update BookInfo
* METHOD : PUT
* URL    : http://localhost:8085/updateBookInfo/104
* RequestBody : Json
    
          {
              "userId":"Vishal Yadav",
              "employee":
                  {
                      "name":"You can Do",
                      "authors":"Yashwan Khankhekar",
                      "totalPageCount": 850
                  }
          }


## Employee API
### 1. API to Save Employee
* METHOD : POST
* URL    : http://localhost:8085/addEmployee
* RequestBody : Json

        {
            "userId":"Vishal Yadav",
            "employee":
                {
                    "name":"RG Goyal",
                    "doj":"08/26/1998",
                    "dept":"IT-Department",
                    "salary": 25000
                }
        }


### 2. API to Update Employee
* METHOD : PUT
* URL    : http://localhost:8085/updateEmployee/1/5400
* RequestBody : Json
        
        {
            "userId":"Vishal Yadav",
            "employee":
                {
                    "name":"Rakesh Goyal",
                    "doj":"08/26/1998",
                    "dept":"IT-Department",
                    "salary": 25000
                }
        }

