package tn.enicarthage.TuniHealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.TuniHealth.dao.ConsultationRepo;
import tn.enicarthage.TuniHealth.entity.Consultation;

@Service
public class ConsultationService {
	@Autowired
	private ConsultationRepo consRepo;
	
	  public Consultation registerNewConsultation(Consultation consultation) {

		  consultation.setId(consultation.getId());
		  consultation.setDate(consultation.getDate());
		  consultation.setPatient(consultation.getPatient());
		  consultation.setMedecin(consultation.getMedecin());
		  consultation.setDescription(consultation.getDescription());
	      return consRepo.save(consultation);
	                             
	    }}