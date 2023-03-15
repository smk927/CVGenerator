package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var intent = intent
        val nName = intent.getStringExtra("Name")
        val jJob = intent.getStringExtra("Job")
        val cContact = intent.getStringExtra("Contact")
        val aAddress = intent.getStringExtra("Address")
        val eEmail = intent.getStringExtra("Email")
        //val dDOB = intent.getStringExtra("DOB")
        val oObjective = intent.getStringExtra("Objective")
        //val sSchool = intent.getStringExtra("School")
        val cCity = intent.getStringExtra("City")
        val cCollege = intent.getStringExtra("College")
        val dDegree = intent.getStringExtra("Degree")
        val yYear = intent.getStringExtra("Year")
        val sSkill1 = intent.getStringExtra("Skill1")
        val sSkill2 = intent.getStringExtra("Skill2")
        val sSkill3 = intent.getStringExtra("Skill3")
        val cCompany = intent.getStringExtra("Company")
        val cCompanyCity = intent.getStringExtra("Company City")
        val jJob1 = intent.getStringExtra("Job1")
        val dDescription = intent.getStringExtra("Description")
        val nNumberYears = intent.getStringExtra("Number of Years")
        val pProject1 = intent.getStringExtra("Project1")
        val pProject2 = intent.getStringExtra("Project2")
        val pProject3 = intent.getStringExtra("Project3")
        val aAchie1 = intent.getStringExtra("Achievement 1")
     val aAchie2 = intent.getStringExtra("Achievement 2")
     val aAchie3 = intent.getStringExtra("Achievement 3")



     val nameTv = findViewById<TextView>(R.id.nameTv)
     nameTv.text = nName
     val titleTv = findViewById<TextView>(R.id.titleTv)
     titleTv.text = jJob
     val emailTv = findViewById<TextView>(R.id.emailTv)
     emailTv.text = eEmail
     val phoneTv = findViewById<TextView>(R.id.phoneTv)
     phoneTv.text = cContact
     val addTv = findViewById<TextView>(R.id.addTv)
     addTv.text = aAddress
     val summaryTv = findViewById<TextView>(R.id.summaryTv)
     summaryTv.text = oObjective
     val degreeTv = findViewById<TextView>(R.id.degreeTv)
     degreeTv.text = dDegree
     val collegeTv = findViewById<TextView>(R.id.collegeTv)
     collegeTv.text = cCollege
     val locationTv = findViewById<TextView>(R.id.locationTv)
     locationTv.text = cCity
     val dateTv = findViewById<TextView>(R.id.dateTv)
     dateTv.text = yYear
     val jobTitleTv = findViewById<TextView>(R.id.jobTitleTv)
     jobTitleTv.text = jJob1
     val companyTv = findViewById<TextView>(R.id.companyTv)
     companyTv.text = cCompany
     val jobDate = findViewById<TextView>(R.id.jobDate)
     jobDate.text = nNumberYears
     val jobDescription = findViewById<TextView>(R.id.jobDescription)
     jobDescription.text = dDescription
     val skill1Tv = findViewById<TextView>(R.id.skill1Tv)
     skill1Tv.text = sSkill1
     val skill2Tv = findViewById<TextView>(R.id.skill2Tv)
     skill2Tv.text = sSkill2
     val skill3Tv = findViewById<TextView>(R.id.skill3Tv)
     skill3Tv.text = sSkill3
     val project1Tv = findViewById<TextView>(R.id.project1Tv)
     project1Tv.text = pProject1
     val project2Tv = findViewById<TextView>(R.id.project2Tv)
     project2Tv.text = pProject2
//     val achievementsTv = findViewById<TextView>(R.id.achievementsTv)
//     achievementsTv.text = aAchie3


//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//     val name_textview = findViewById<TextView>(R.id.name_textview)
//     name_textview.text = nName
//




    }
}