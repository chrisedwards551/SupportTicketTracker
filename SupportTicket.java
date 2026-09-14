public class SupportTicket {

    private int ticketId;
    private String title;
    private String description;
    private TicketStatus status;
    private TicketPriority priority;
    private User assignedUser;

    public SupportTicket(
        int ticketId,
        String title,
        String description,
        TicketStatus status,
        TicketPriority priority,
        User assignedUser) {

    this.ticketId = ticketId;
    this.title = title;
    this.description = description;
    this.status = status;
    this.priority = priority;
    this.assignedUser = assignedUser;
}

    public int getTicketId() {
        return ticketId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public TicketPriority getPriority() {
        return priority;
    }
    
    public User getAssignedUser() {
        return assignedUser;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public void displayTicket() {

        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
        
        
        if (assignedUser != null) {

            System.out.println(
                "Assigned User: " + assignedUser.getName()
            );

        } else {

            System.out.println(
                "Assigned User: Unassigned"
            );
        }
    }
}