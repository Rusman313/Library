class PublishingCompany {
    String pubCompany;
    public PublishingCompany(){//default
        this.pubCompany = "Publishing Company";
    }
    public PublishingCompany(String pubCompany){//takes arguments
        this.pubCompany = pubCompany;
    }

    //getters and setters
    public String getPubCompany(){
        return pubCompany;
    }
    public void setPubCompany(String pubCompany){
        this.pubCompany = pubCompany;
    }



}

