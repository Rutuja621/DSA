package Scenarios;

import java.util.*;

public class StudentResultPerformanceManagement {

    // ================= STUDENT POJO =================

    static class Student {

        private int studentId;
        private String name;
        private String course;
        private double marks;
        private double attendance;
        private String city;
        private String status;

        // Constructor
        public Student(int studentId, String name, String course,
                       double marks, double attendance,
                       String city, String status) {

            this.studentId = studentId;
            this.name = name;
            this.course = course;
            this.marks = marks;
            this.attendance = attendance;
            this.city = city;
            this.status = status;
        }

        // Getters

        public int getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }

        public String getCourse() {
            return course;
        }

        public double getMarks() {
            return marks;
        }

        public double getAttendance() {
            return attendance;
        }

        public String getCity() {
            return city;
        }

        public String getStatus() {
            return status;
        }

        // Setters

        public void setName(String name) {
            this.name = name;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

        public void setAttendance(double attendance) {
            this.attendance = attendance;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {

            return "ID: " + studentId
                    + ", Name: " + name
                    + ", Course: " + course
                    + ", Marks: " + marks
                    + ", Attendance: " + attendance + "%"
                    + ", City: " + city
                    + ", Status: " + status;
        }
    }


    // ================= MAP =================

    static Map<Integer, Student> students =
            new HashMap<>();


    // ================= 1. ADD STUDENT =================

    public static void addStudent(Student student) {

        if (students.containsKey(student.getStudentId())) {

            System.out.println("Student already exists.");

        } else {

            students.put(
                    student.getStudentId(),
                    student
            );

            System.out.println(
                    "Student added successfully."
            );
        }
    }


    // ================= 2. UPDATE STUDENT =================

    public static void updateStudent(
            int id,
            Scanner sc) {

        Student student =
                students.get(id);

        if (student == null) {

            System.out.println(
                    "Student not found."
            );

            return;
        }

        System.out.print(
                "Enter new name: "
        );

        String name =
                sc.nextLine();


        System.out.print(
                "Enter new course: "
        );

        String course =
                sc.nextLine();


        System.out.print(
                "Enter new marks: "
        );

        double marks =
                sc.nextDouble();


        System.out.print(
                "Enter new attendance: "
        );

        double attendance =
                sc.nextDouble();

        sc.nextLine();


        System.out.print(
                "Enter new city: "
        );

        String city =
                sc.nextLine();


        System.out.print(
                "Enter new status: "
        );

        String status =
                sc.nextLine();


        student.setName(name);
        student.setCourse(course);
        student.setMarks(marks);
        student.setAttendance(attendance);
        student.setCity(city);
        student.setStatus(status);


        System.out.println(
                "Student updated successfully."
        );
    }


    // ================= 3. DELETE STUDENT =================

    public static void deleteStudent(int id) {

        if (students.remove(id) != null) {

            System.out.println(
                    "Student deleted successfully."
            );

        } else {

            System.out.println(
                    "Student not found."
            );
        }
    }


    // ================= 4. SEARCH STUDENT =================

    public static void searchStudent(int id) {

        Student student =
                students.get(id);

        if (student != null) {

            System.out.println(student);

        } else {

            System.out.println(
                    "Student not found."
            );
        }
    }


    // ================= 5. TOTAL MARKS =================

    public static double calculateTotalMarks(
            Student student) {

        // Marks are out of 100

        return student.getMarks();
    }


    // ================= 6. PERCENTAGE =================

    public static double calculatePercentage(
            Student student) {

        /*
         * Marks are out of 100.
         *
         * Therefore:
         *
         * Percentage = marks
         */

        return student.getMarks();
    }


    // ================= 7. ASSIGN GRADE =================

    public static String assignGrade(
            Student student) {

        double marks =
                student.getMarks();


        if (marks >= 90) {

            return "A+";

        } else if (marks >= 80) {

            return "A";

        } else if (marks >= 70) {

            return "B";

        } else if (marks >= 60) {

            return "C";

        } else if (marks >= 50) {

            return "D";

        } else {

            return "F";
        }
    }


    // ================= 8. FIND TOPPER =================

    public static void findTopper() {

        Student topper = null;

        for (Student student :
                students.values()) {

            if (topper == null ||
                    student.getMarks()
                            > topper.getMarks()) {

                topper = student;
            }
        }


        if (topper != null) {

            System.out.println(
                    topper.getStudentId()
                            + " - "
                            + topper.getName()
                            + " - "
                            + topper.getMarks()
                            + "%"
            );
        }
    }


    // ================= 9. FAILED STUDENTS =================

    public static void findFailedStudents() {

        boolean found = false;

        for (Student student :
                students.values()) {

            if (student.getMarks() < 50) {

                System.out.println(
                        student.getStudentId()
                                + " - "
                                + student.getName()
                                + " - "
                                + student.getMarks()
                                + "%"
                );

                found = true;
            }
        }


        if (!found) {

            System.out.println(
                    "No failed students."
            );
        }
    }


    // ================= 10. ATTENDANCE BELOW 75 =================

    public static void attendanceShortage() {

        boolean found = false;

        for (Student student :
                students.values()) {

            if (student.getAttendance() < 75) {

                System.out.println(
                        student.getStudentId()
                                + " - "
                                + student.getName()
                                + " - "
                                + student.getAttendance()
                                + "%"
                );

                found = true;
            }
        }


        if (!found) {

            System.out.println(
                    "No student has attendance shortage."
            );
        }
    }


    // ================= 11. COURSE-WISE AVERAGE =================

    public static void courseWiseAverage() {

        Map<String, Double> totalMarks =
                new HashMap<>();

        Map<String, Integer> count =
                new HashMap<>();


        for (Student student :
                students.values()) {

            String course =
                    student.getCourse();


            double marks =
                    student.getMarks();


            // Add marks

            totalMarks.put(
                    course,
                    totalMarks.getOrDefault(course, 0.0)
                            + marks
            );


            // Count students

            count.put(
                    course,
                    count.getOrDefault(course, 0) + 1
            );
        }


        for (String course :
                totalMarks.keySet()) {

            double total =
                    totalMarks.get(course);

            int studentCount =
                    count.get(course);


            double average =
                    total / studentCount;


            System.out.println(
                    course
                            + " Average = "
                            + average
            );
        }
    }


    // ================= 12. ABOVE COURSE AVERAGE =================

    public static void studentsAboveCourseAverage() {

        Map<String, Double> totalMarks =
                new HashMap<>();

        Map<String, Integer> count =
                new HashMap<>();


        // Calculate total and count

        for (Student student :
                students.values()) {

            String course =
                    student.getCourse();


            totalMarks.put(
                    course,
                    totalMarks.getOrDefault(course, 0.0)
                            + student.getMarks()
            );


            count.put(
                    course,
                    count.getOrDefault(course, 0) + 1
            );
        }


        // Find average

        Map<String, Double> averageMap =
                new HashMap<>();


        for (String course :
                totalMarks.keySet()) {

            double average =
                    totalMarks.get(course)
                            / count.get(course);

            averageMap.put(
                    course,
                    average
            );
        }


        // Find students above average

        for (Student student :
                students.values()) {

            double average =
                    averageMap.get(
                            student.getCourse()
                    );


            if (student.getMarks() > average) {

                System.out.println(
                        student.getStudentId()
                                + " - "
                                + student.getName()
                                + " - "
                                + student.getCourse()
                                + " - Marks: "
                                + student.getMarks()
                                + " - Average: "
                                + average
                );
            }
        }
    }


    // ================= 13. UPDATE STATUS =================

    public static void updateStatusBasedOnResult() {

        for (Student student :
                students.values()) {

            /*
             * Attendance below 75
             * means NOT ELIGIBLE.
             */

            if (student.getAttendance() < 75) {

                student.setStatus(
                        "NOT ELIGIBLE"
                );

            } else if (student.getMarks() < 50) {

                student.setStatus(
                        "FAILED"
                );

            } else {

                student.setStatus(
                        "PASS"
                );
            }
        }

        System.out.println(
                "Student status updated successfully."
        );
    }


    // ================= 14. GENERATE RANK =================

    public static void generateRank() {

        List<Student> studentList =
                new ArrayList<>(
                        students.values()
                );


        // Sort by marks descending

        studentList.sort(
                (s1, s2) ->
                        Double.compare(
                                s2.getMarks(),
                                s1.getMarks()
                        )
        );


        int rank = 1;


        for (Student student :
                studentList) {

            System.out.println(
                    "Rank "
                            + rank
                            + " - "
                            + student.getStudentId()
                            + " - "
                            + student.getName()
                            + " - "
                            + student.getMarks()
            );

            rank++;
        }
    }


    // ================= DISPLAY ALL =================

    public static void displayAllStudents() {

        if (students.isEmpty()) {

            System.out.println(
                    "No students available."
            );

            return;
        }


        for (Student student :
                students.values()) {

            System.out.println(student);
        }
    }


    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);


        // ================= SAMPLE DATA =================

        students.put(
                101,
                new Student(
                        101,
                        "Rahul",
                        "Java",
                        85,
                        78,
                        "Pune",
                        "ACTIVE"
                )
        );


        students.put(
                102,
                new Student(
                        102,
                        "Amit",
                        "Java",
                        65,
                        82,
                        "Mumbai",
                        "ACTIVE"
                )
        );


        students.put(
                103,
                new Student(
                        103,
                        "Sneha",
                        "Python",
                        92,
                        91,
                        "Pune",
                        "ACTIVE"
                )
        );


        students.put(
                104,
                new Student(
                        104,
                        "Priya",
                        "Java",
                        45,
                        68,
                        "Nashik",
                        "ACTIVE"
                )
        );


        students.put(
                105,
                new Student(
                        105,
                        "Kiran",
                        "Python",
                        75,
                        88,
                        "Pune",
                        "ACTIVE"
                )
        );


        // ================= MENU =================

        int choice;


        do {

            System.out.println(
                    "\n========================================"
            );

            System.out.println(
                    " STUDENT RESULT & PERFORMANCE SYSTEM"
            );

            System.out.println(
                    "========================================"
            );

            System.out.println(
                    "1.  Add Student"
            );

            System.out.println(
                    "2.  Update Student"
            );

            System.out.println(
                    "3.  Delete Student"
            );

            System.out.println(
                    "4.  Search Student"
            );

            System.out.println(
                    "5.  Calculate Total Marks"
            );

            System.out.println(
                    "6.  Calculate Percentage"
            );

            System.out.println(
                    "7.  Assign Grade"
            );

            System.out.println(
                    "8.  Find Topper"
            );

            System.out.println(
                    "9.  Find Failed Students"
            );

            System.out.println(
                    "10. Attendance Shortage"
            );

            System.out.println(
                    "11. Course-wise Average"
            );

            System.out.println(
                    "12. Students Above Course Average"
            );

            System.out.println(
                    "13. Update Status Based On Result"
            );

            System.out.println(
                    "14. Generate Rank"
            );

            System.out.println(
                    "15. Display All Students"
            );

            System.out.println(
                    "0. Exit"
            );


            System.out.print(
                    "Enter your choice: "
            );

            choice =
                    sc.nextInt();

            sc.nextLine();


            switch (choice) {


                // ================= ADD =================

                case 1:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int id =
                            sc.nextInt();

                    sc.nextLine();


                    System.out.print(
                            "Enter Name: "
                    );

                    String name =
                            sc.nextLine();


                    System.out.print(
                            "Enter Course: "
                    );

                    String course =
                            sc.nextLine();


                    System.out.print(
                            "Enter Marks: "
                    );

                    double marks =
                            sc.nextDouble();


                    System.out.print(
                            "Enter Attendance: "
                    );

                    double attendance =
                            sc.nextDouble();

                    sc.nextLine();


                    System.out.print(
                            "Enter City: "
                    );

                    String city =
                            sc.nextLine();


                    System.out.print(
                            "Enter Status: "
                    );

                    String status =
                            sc.nextLine();


                    Student student =
                            new Student(
                                    id,
                                    name,
                                    course,
                                    marks,
                                    attendance,
                                    city,
                                    status
                            );


                    addStudent(student);

                    break;


                // ================= UPDATE =================

                case 2:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int updateId =
                            sc.nextInt();

                    sc.nextLine();


                    updateStudent(
                            updateId,
                            sc
                    );

                    break;


                // ================= DELETE =================

                case 3:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int deleteId =
                            sc.nextInt();


                    deleteStudent(deleteId);

                    break;


                // ================= SEARCH =================

                case 4:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int searchId =
                            sc.nextInt();


                    searchStudent(searchId);

                    break;


                // ================= TOTAL MARKS =================

                case 5:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int totalId =
                            sc.nextInt();


                    Student totalStudent =
                            students.get(totalId);


                    if (totalStudent != null) {

                        System.out.println(
                                "Total Marks = "
                                        + calculateTotalMarks(
                                        totalStudent
                                )
                        );

                    } else {

                        System.out.println(
                                "Student not found."
                        );
                    }

                    break;


                // ================= PERCENTAGE =================

                case 6:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int percentageId =
                            sc.nextInt();


                    Student percentageStudent =
                            students.get(
                                    percentageId
                            );


                    if (percentageStudent != null) {

                        System.out.println(
                                "Percentage = "
                                        + calculatePercentage(
                                        percentageStudent
                                )
                                        + "%"
                        );

                    } else {

                        System.out.println(
                                "Student not found."
                        );
                    }

                    break;


                // ================= GRADE =================

                case 7:

                    System.out.print(
                            "Enter Student ID: "
                    );

                    int gradeId =
                            sc.nextInt();


                    Student gradeStudent =
                            students.get(gradeId);


                    if (gradeStudent != null) {

                        System.out.println(
                                gradeStudent.getName()
                                        + " - Grade = "
                                        + assignGrade(
                                        gradeStudent
                                )
                        );

                    } else {

                        System.out.println(
                                "Student not found."
                        );
                    }

                    break;


                // ================= TOPPER =================

                case 8:

                    System.out.println(
                            "\nTopper:"
                    );

                    findTopper();

                    break;


                // ================= FAILED =================

                case 9:

                    System.out.println(
                            "\nFailed Students:"
                    );

                    findFailedStudents();

                    break;


                // ================= ATTENDANCE =================

                case 10:

                    System.out.println(
                            "\nAttendance Shortage:"
                    );

                    attendanceShortage();

                    break;


                // ================= COURSE AVERAGE =================

                case 11:

                    System.out.println(
                            "\nCourse-wise Average:"
                    );

                    courseWiseAverage();

                    break;


                // ================= ABOVE AVERAGE =================

                case 12:

                    System.out.println(
                            "\nStudents Above Course Average:"
                    );

                    studentsAboveCourseAverage();

                    break;


                // ================= STATUS =================

                case 13:

                    updateStatusBasedOnResult();

                    break;


                // ================= RANK =================

                case 14:

                    System.out.println(
                            "\nStudent Ranking:"
                    );

                    generateRank();

                    break;


                // ================= DISPLAY =================

                case 15:

                    System.out.println(
                            "\nAll Students:"
                    );

                    displayAllStudents();

                    break;


                // ================= EXIT =================

                case 0:

                    System.out.println(
                            "Thank you!"
                    );

                    break;


                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }


        } while (choice != 0);


        sc.close();
    }
}