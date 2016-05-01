package com.epam;

import com.epam.services.impl.ProposalServiceImpl;

public class ProposalInitializer {
    private ProposalServiceImpl proposalService;

    public ProposalServiceImpl getProposalService() {
        return proposalService;
    }

    public void setProposalService(ProposalServiceImpl proposalService) {
        this.proposalService = proposalService;
    }
}
