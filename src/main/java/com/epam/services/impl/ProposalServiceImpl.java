package com.epam.services.impl;

import com.epam.repositories.UserRepository;
import com.epam.services.ProposalService;

/**
 * Created by Almas_Doskozhin
 * on 4/27/2016.
 */

public class ProposalServiceImpl implements ProposalService {
    private UserRepository userRepository;
    private String proposalName;

    public ProposalServiceImpl(UserRepository repository){
        this.userRepository = repository;

    }

    public String getProposalName() {
        return proposalName;
    }

    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }
}
