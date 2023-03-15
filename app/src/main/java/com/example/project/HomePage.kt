package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val name = findViewById<TextInputEditText>(R.id.Name)
        val job = findViewById<TextInputEditText>(R.id.Job)
        val contact = findViewById<TextInputEditText>(R.id.Contact)
        val address = findViewById<TextInputEditText>(R.id.Address)
        val email = findViewById<TextInputEditText>(R.id.Email)
        val dOB = findViewById<TextInputEditText>(R.id.DOB)
        val objective = findViewById<TextInputEditText>(R.id.objective1Et)
        val school = findViewById<TextInputEditText>(R.id.schoolEt)
        val city = findViewById<TextInputEditText>(R.id.cityET)
        val college = findViewById<TextInputEditText>(R.id.collegeEt)
        val degree = findViewById<TextInputEditText>(R.id.degreeEt)
        val year = findViewById<TextInputEditText>(R.id.yearEt)
        val skill1 = findViewById<TextInputEditText>(R.id.skillsEt)
        val skill2 = findViewById<TextInputEditText>(R.id.s2ET)
        val skill3 = findViewById<TextInputEditText>(R.id.s3Et)
        val company = findViewById<TextInputEditText>(R.id.companyEt)
        val companyCity = findViewById<TextInputEditText>(R.id.city1ET)
        val job1 = findViewById<TextInputEditText>(R.id.jobEt)
        val description = findViewById<TextInputEditText>(R.id.descriptionEt)
        val numberYears = findViewById<TextInputEditText>(R.id.numberyearEt)
        val project1 = findViewById<TextInputEditText>(R.id.project1Et)
        val project2 = findViewById<TextInputEditText>(R.id.project2ET)
        val project3 = findViewById<TextInputEditText>(R.id.project3Et)
        val ach1 = findViewById<TextInputEditText>(R.id.ach1Et)
        val ach2 = findViewById<TextInputEditText>(R.id.ach2ET)
        val ach3 = findViewById<TextInputEditText>(R.id.ach3Et)

        val buttonSaveData = findViewById<Button>(R.id.buttonSaveData)


        buttonSaveData.setOnClickListener {
            val nName = name.text.toString()
            val jJob = job.text.toString()
            val cContact = contact.text.toString()
            val aAddress = address.text.toString()
            val eEmail = email.text.toString()
            val dDOB = dOB.text.toString()
            val oObjective = objective.text.toString()
            val sSchool = school.text.toString()
            val cCity = city.text.toString()
            val cCollege = college.text.toString()
            val dDegree = degree.text.toString()
            val yYear = year.text.toString()
            val sSkill1 = skill1.text.toString()
            val sSkill2 = skill2.text.toString()
            val sSkill3 = skill3.text.toString()
            val cCompany = company.text.toString()
            val cCompanyCity = companyCity.text.toString()
            val jJob1 = job1.text.toString()
            val dDescription = description.text.toString()
            val nNumberYears = numberYears.text.toString()
            val pProject1 = project1.text.toString()
            val pProject2 = project2.text.toString()
            val pProject3 = project3.text.toString()
            val aAch1 = ach1.text.toString()
            var aAch2 = ach2.text.toString()
            var aAch3 = ach3.text.toString()

            val intent = Intent( this@HomePage,MainActivity::class.java)
            intent.putExtra("Name", nName)
            intent.putExtra("Job", jJob)
            intent.putExtra("Contact", cContact)
            intent.putExtra("Address", aAddress)
            intent.putExtra("Email", eEmail)
         //   intent.putExtra("DOB", dDOB)
            intent.putExtra("Objective", oObjective)
            intent.putExtra("School", sSchool)
            intent.putExtra("City", cCity)
            intent.putExtra("College", cCollege)
            intent.putExtra("Degree", dDegree)
            intent.putExtra("Year", yYear)
            intent.putExtra("Skill1", sSkill1)
            intent.putExtra("Skill2", sSkill2)
            intent.putExtra("Skill3", sSkill3)
            intent.putExtra("Company", cCompany)
            intent.putExtra("Company City", cCompanyCity)
            intent.putExtra("Job1", jJob1)
            intent.putExtra("Description", dDescription)
            intent.putExtra("Number of Years", nNumberYears)
            intent.putExtra("Project1", pProject1)
            intent.putExtra("Project2", pProject2)
            intent.putExtra("Project3", pProject3)
            intent.putExtra("Achievement1", aAch1)
            intent.putExtra("Achievement2",aAch2 )
            intent.putExtra("Achievement3", aAch3)


            startActivity(intent)

        }






    }
}