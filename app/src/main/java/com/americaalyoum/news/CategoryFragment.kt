package com.americaalyoum.news

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment : Fragment(R.layout.fragment_category) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cairo: Typeface = Typeface.createFromAsset(requireContext().assets, "cairo.ttf")

        cWorld.typeface = cairo
        cAmerica.typeface = cairo
        cEgypt.typeface = cairo
        cImmigration.typeface = cairo
        cInAmerica.typeface = cairo
        cArabAmerica.typeface = cairo
        cUniversities.typeface = cairo
        cJobs.typeface = cairo
        cInformation.typeface = cairo
        cTechnology.typeface = cairo
        cFinance.typeface = cairo
        cHealth.typeface = cairo
        cEntertainment.typeface = cairo
        cSport.typeface = cairo

        cWorld.setOnClickListener {
            val toWorld = CategoryFragmentDirections.actionCategoryFragmentToCategoryWorld()
            findNavController().navigate(toWorld)
        }
        cAmerica.setOnClickListener {
            val toAmerica = CategoryFragmentDirections.actionCategoryFragmentToCategoryAmerica()
            findNavController().navigate(toAmerica)
        }

        cEgypt.setOnClickListener {
            val toEgypt = CategoryFragmentDirections.actionCategoryFragmentToCategoryEgypt()
            findNavController().navigate(toEgypt)
        }

        cImmigration.setOnClickListener {
            val toImmigration = CategoryFragmentDirections.actionCategoryFragmentToCategoryImmigration()
            findNavController().navigate(toImmigration)
        }

        cInAmerica.setOnClickListener {
            val toInAmerica = CategoryFragmentDirections.actionCategoryFragmentToCategoryInAmerica()
            findNavController().navigate(toInAmerica)
        }

        cArabAmerica.setOnClickListener {
            val toArabAmerica = CategoryFragmentDirections.actionCategoryFragmentToCategoryArabAmerica()
            findNavController().navigate(toArabAmerica)
        }

        cUniversities.setOnClickListener {
            val toUniversities = CategoryFragmentDirections.actionCategoryFragmentToCategoryUniversities()
            findNavController().navigate(toUniversities)
        }

        cJobs.setOnClickListener {
            val toJobs = CategoryFragmentDirections.actionCategoryFragmentToCategoryJobs()
            findNavController().navigate(toJobs)
        }

        cInformation.setOnClickListener {
            val toInformation = CategoryFragmentDirections.actionCategoryFragmentToCategoryInformation()
            findNavController().navigate(toInformation)
        }

        cTechnology.setOnClickListener {
            val toTechnology = CategoryFragmentDirections.actionCategoryFragmentToCategoryTechnology()
            findNavController().navigate(toTechnology)
        }

        cFinance.setOnClickListener {
            val toFinance = CategoryFragmentDirections.actionCategoryFragmentToCategoryFinance()
            findNavController().navigate(toFinance)
        }

        cHealth.setOnClickListener {
            val toHealth = CategoryFragmentDirections.actionCategoryFragmentToCategoryHealth()
            findNavController().navigate(toHealth)
        }

        cEntertainment.setOnClickListener {
            val toEntertainment = CategoryFragmentDirections.actionCategoryFragmentToCategoryEntertainment()
            findNavController().navigate(toEntertainment)
        }

        cSport.setOnClickListener {
            val toSport = CategoryFragmentDirections.actionCategoryFragmentToCategorySport()
            findNavController().navigate(toSport)
        }
    }
}