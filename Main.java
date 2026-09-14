import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("   SUPPORT TICKET TRACKER");
        System.out.println("================================");
        System.out.println();

        User user =
            new User(
                1,
                "Chris Edwards",
                "chris@example.com"
            );

        ArrayList<User> users = new ArrayList<>();

        users.add(user);

        User user2 =
            new User(
                2,
                "Alex Johnson",
                "alex@example.com"
            );

        users.add(user2);

        System.out.println("Users:");

        for (User currentUser : users) {
            currentUser.displayUser();
            System.out.println();
        }

        System.out.println("User:");
        user.displayUser();

        System.out.println();

        SupportTicket ticket =
            new SupportTicket(
                1001,
                "Cannot connect to VPN",
                "User cannot establish VPN connection.",
                TicketStatus.OPEN,
                TicketPriority.HIGH,
                user
            );

        ArrayList<SupportTicket> tickets = new ArrayList<>();

        tickets.add(ticket);

        SupportTicket ticket2 =
            new SupportTicket(
                1002,
                "Password reset required",
                "User needs assistance resetting their password.",
                TicketStatus.IN_PROGRESS,
                TicketPriority.MEDIUM,
                user2
            );

        tickets.add(ticket2);

        SupportTicket ticket3 =
            new SupportTicket(
                1003,
                "Email not working",
                "User cannot send or receive email messages.",
                TicketStatus.OPEN,
                TicketPriority.CRITICAL,
                user
            );

        tickets.add(ticket3);

        tickets.remove(ticket2);

        System.out.println("Support Ticket:");
        ticket.displayTicket();

        System.out.println();

        System.out.println("All Tickets:");

        for (SupportTicket currentTicket : tickets) {
            currentTicket.displayTicket();
            System.out.println();
        }

        System.out.println("Tickets After Removal:");

        for (SupportTicket currentTicket : tickets) {
            currentTicket.displayTicket();
            System.out.println();
        }

        System.out.println(
            "Total tickets remaining: " + tickets.size()
        );

        int searchTicketId = 1003;

        SupportTicket foundTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getTicketId() == searchTicketId) {
                foundTicket = currentTicket;
            }
        }

        if (foundTicket != null) {

            System.out.println();
            System.out.println("Ticket Found:");
            foundTicket.displayTicket();

        } else {

            System.out.println();
            System.out.println("Ticket not found.");
        }

        if (foundTicket != null) {

            System.out.println();
            System.out.println("Current Ticket Status: "
                + foundTicket.getStatus());

            System.out.println("Current Ticket Priority: "
                + foundTicket.getPriority());
        }

        if (foundTicket != null) {

            foundTicket.setStatus(TicketStatus.IN_PROGRESS);

            System.out.println();
            System.out.println("Ticket status updated.");

            System.out.println("New Ticket Status: "
                + foundTicket.getStatus());
        }

        if (foundTicket != null) {

            foundTicket.setPriority(TicketPriority.HIGH);

            System.out.println();
            System.out.println("Ticket priority updated.");

            System.out.println("New Ticket Priority: "
                + foundTicket.getPriority());
        }

        if (foundTicket != null) {

            foundTicket.setTitle("Email service not working");

            System.out.println();
            System.out.println("Ticket title updated.");

            System.out.println("New Ticket Title: "
                + foundTicket.getTitle());
        }

        if (foundTicket != null) {

            foundTicket.setDescription(
                "User cannot send or receive email messages or access webmail."
            );

            System.out.println();
            System.out.println("Ticket description updated.");

            System.out.println("New Ticket Description: "
                + foundTicket.getDescription());
        }

        String searchTitle = "Email service not working";

        SupportTicket foundByTitle = null;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getTitle().equals(searchTitle)) {
                foundByTitle = currentTicket;
            }
        }

        if (foundByTitle != null) {

            System.out.println();
            System.out.println("Ticket Found By Title:");
            foundByTitle.displayTicket();

        } else {

            System.out.println();
            System.out.println("No ticket found with that title.");
        }

        System.out.println();
        System.out.println("Tickets In Progress:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getStatus() == TicketStatus.IN_PROGRESS) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("High Priority Tickets:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getPriority() == TicketPriority.HIGH) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Tickets Assigned to Chris:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == user) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        if (foundTicket != null) {

            foundTicket.setAssignedUser(user2);

            System.out.println();
            System.out.println("Ticket reassigned.");

            System.out.println("New Assigned User: "
                + foundTicket.getAssignedUser().getName());
        }

        System.out.println();
        System.out.println("Tickets Assigned to Alex:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == user2) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        SupportTicket unassignedTicket =
            new SupportTicket(
                1004,
                "Printer not working",
                "User cannot print documents.",
                TicketStatus.OPEN,
                TicketPriority.LOW,
                null
            );

        tickets.add(unassignedTicket);

        System.out.println();
        System.out.println("Unassigned Tickets:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == null) {

                currentTicket.displayTicket();
                System.out.println();
            }
        }

        if (unassignedTicket.getAssignedUser() == null) {

            unassignedTicket.setAssignedUser(user2);

            System.out.println();
            System.out.println("Unassigned ticket assigned.");

            System.out.println("New Assigned User: "
                + unassignedTicket.getAssignedUser().getName());
        }

        System.out.println();
        System.out.println("All Tickets Assigned to Alex:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == user2) {

                currentTicket.displayTicket();
                System.out.println();
            }
        }

        int openTicketCount = 0;
        int inProgressTicketCount = 0;
        int resolvedTicketCount = 0;
        int closedTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getStatus() == TicketStatus.OPEN) {

                openTicketCount++;

            } else if (currentTicket.getStatus() == TicketStatus.IN_PROGRESS) {

                inProgressTicketCount++;

            } else if (currentTicket.getStatus() == TicketStatus.RESOLVED) {

                resolvedTicketCount++;

            } else if (currentTicket.getStatus() == TicketStatus.CLOSED) {

                closedTicketCount++;
            }
        }

        System.out.println();
        System.out.println("Ticket Counts By Status:");

        System.out.println("Open: " + openTicketCount);
        System.out.println("In Progress: " + inProgressTicketCount);
        System.out.println("Resolved: " + resolvedTicketCount);
        System.out.println("Closed: " + closedTicketCount);


        int lowPriorityCount = 0;
        int mediumPriorityCount = 0;
        int highPriorityCount = 0;
        int criticalPriorityCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getPriority() == TicketPriority.LOW) {

                lowPriorityCount++;

            } else if (currentTicket.getPriority() == TicketPriority.MEDIUM) {

                mediumPriorityCount++;

            } else if (currentTicket.getPriority() == TicketPriority.HIGH) {

                highPriorityCount++;

            } else if (currentTicket.getPriority() == TicketPriority.CRITICAL) {

                criticalPriorityCount++;
            }
        }

        System.out.println();
        System.out.println("Ticket Counts By Priority:");

        System.out.println("Low: " + lowPriorityCount);
        System.out.println("Medium: " + mediumPriorityCount);
        System.out.println("High: " + highPriorityCount);
        System.out.println("Critical: " + criticalPriorityCount); 
        
        int chrisTicketCount = 0;
        int alexTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == user) {
                chrisTicketCount++;
            }

            if (currentTicket.getAssignedUser() == user2) {
                alexTicketCount++;
            }
        }

        System.out.println();
        System.out.println("Ticket Counts By User:");

        System.out.println("Chris Edwards: " + chrisTicketCount);
        System.out.println("Alex Johnson: " + alexTicketCount);

        int unassignedTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == null) {
                unassignedTicketCount++;
            }
        }


        System.out.println();
        System.out.println("Unassigned Ticket Count: "
            + unassignedTicketCount);

        System.out.println();
        System.out.println("Highest-Priority Ticket:");

        SupportTicket highestPriorityTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (highestPriorityTicket == null ||
                currentTicket.getPriority().ordinal() >
                highestPriorityTicket.getPriority().ordinal()) {

                highestPriorityTicket = currentTicket;
            }
        }

        if (highestPriorityTicket != null) {
            highestPriorityTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Tickets By Priority:");

        System.out.println();
        System.out.println("Critical Priority Tickets:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getPriority() == TicketPriority.CRITICAL) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println("High Priority Tickets:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getPriority() == TicketPriority.HIGH) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println("Medium Priority Tickets:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getPriority() == TicketPriority.MEDIUM) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println("Low Priority Tickets:");

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getPriority() == TicketPriority.LOW) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Active Ticket Summary:");

        int activeTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS) {

                activeTicketCount++;
            }
        }

        System.out.println("Active Tickets: " + activeTicketCount);

        System.out.println();
        System.out.println("Oldest Ticket:");

        SupportTicket oldestTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (oldestTicket == null ||
                currentTicket.getTicketId() < oldestTicket.getTicketId()) {

                oldestTicket = currentTicket;
            }
        }

        if (oldestTicket != null) {
            oldestTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Most Recent Ticket:");

        SupportTicket mostRecentTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (mostRecentTicket == null ||
                currentTicket.getTicketId() > mostRecentTicket.getTicketId()) {

                mostRecentTicket = currentTicket;
            }
        }

        if (mostRecentTicket != null) {
            mostRecentTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Tickets By Assigned User:");

        for (User currentUser : users) {

            int assignedTicketCount = 0;

            for (SupportTicket currentTicket : tickets) {

                if (currentTicket.getAssignedUser() == currentUser) {
                    assignedTicketCount++;
                }
            }

            System.out.println(
                currentUser.getName() + ": " + assignedTicketCount
            );
        }

        System.out.println();
        System.out.println("Tickets With No Assignment:");

        int ticketsWithNoAssignment = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() == null) {
                ticketsWithNoAssignment++;
            }
        }

        System.out.println(
            "Tickets With No Assignment: " + ticketsWithNoAssignment
        );

        System.out.println();
        System.out.println("Highest-Priority Active Ticket:");

        SupportTicket highestPriorityActiveTicket = null;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (isActive &&
                (highestPriorityActiveTicket == null ||
                currentTicket.getPriority().ordinal() >
                highestPriorityActiveTicket.getPriority().ordinal())) {

                highestPriorityActiveTicket = currentTicket;
            }
        }

        if (highestPriorityActiveTicket != null) {
            highestPriorityActiveTicket.displayTicket();
        }

        System.out.println();
        System.out.println("High-Priority Active Tickets:");

        int highPriorityActiveCount = 0;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (isActive &&
                currentTicket.getPriority() == TicketPriority.HIGH) {

                highPriorityActiveCount++;
            }
        }

        System.out.println(
            "High-Priority Active Tickets: " + highPriorityActiveCount
        );

        System.out.println();
        System.out.println("Most Common Ticket Priority:");

        TicketPriority mostCommonPriority = TicketPriority.LOW;
        int highestPriorityCount = lowPriorityCount;

        if (mediumPriorityCount > highestPriorityCount) {

            mostCommonPriority = TicketPriority.MEDIUM;
            highestPriorityCount = mediumPriorityCount;
        }

        if (highPriorityCount > highestPriorityCount) {

            mostCommonPriority = TicketPriority.HIGH;
            highestPriorityCount = highPriorityCount;
        }

        if (criticalPriorityCount > highestPriorityCount) {

            mostCommonPriority = TicketPriority.CRITICAL;
            highestPriorityCount = criticalPriorityCount;
        }

        System.out.println(
            "Most Common Priority: " + mostCommonPriority
        );

        System.out.println(
            "Ticket Count: " + highestPriorityCount
        );

        System.out.println();
        System.out.println("Most Common Ticket Status:");

        TicketStatus mostCommonStatus = TicketStatus.OPEN;
        int highestStatusCount = openTicketCount;

        if (inProgressTicketCount > highestStatusCount) {

            mostCommonStatus = TicketStatus.IN_PROGRESS;
            highestStatusCount = inProgressTicketCount;
        }

        if (resolvedTicketCount > highestStatusCount) {

            mostCommonStatus = TicketStatus.RESOLVED;
            highestStatusCount = resolvedTicketCount;
        }

        if (closedTicketCount > highestStatusCount) {

        mostCommonStatus = TicketStatus.CLOSED;
            highestStatusCount = closedTicketCount;
        }

        System.out.println(
            "Most Common Status: " + mostCommonStatus
        );

        System.out.println(
            "Ticket Count: " + highestStatusCount
        );

        System.out.println();
        System.out.println("Tickets Matching Keyword:");

        String keyword = "email";

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getTitle()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Tickets Matching Description Keyword:");

        String descriptionKeyword = "webmail";

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getDescription()
                    .toLowerCase()
                    .contains(descriptionKeyword.toLowerCase())) {

                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Count Tickets Matching Keyword:");

        String countKeyword = "not";

        int matchingKeywordCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getTitle()
                    .toLowerCase()
                    .contains(countKeyword.toLowerCase())) {

                matchingKeywordCount++;
            }
        }

        System.out.println(
            "Tickets Matching \"" + countKeyword + "\": "
            + matchingKeywordCount
        );

        System.out.println();
        System.out.println("Count Tickets Matching Description Keyword:");

        String countDescriptionKeyword = "user";

        int matchingDescriptionCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getDescription()
                    .toLowerCase()
                    .contains(countDescriptionKeyword.toLowerCase())) {

                matchingDescriptionCount++;
            }
        }

        System.out.println(
            "Tickets Matching Description \"" + countDescriptionKeyword + "\": "
            + matchingDescriptionCount
        );

        System.out.println();
        System.out.println("Tickets Matching Title and Description:");

        String titleSearchKeyword = "not";
        String descriptionSearchKeyword = "user";

        for (SupportTicket currentTicket : tickets) {

            boolean titleMatches =
                currentTicket.getTitle()
                    .toLowerCase()
                    .contains(titleSearchKeyword.toLowerCase());

            boolean descriptionMatches =
                currentTicket.getDescription()
                    .toLowerCase()
                    .contains(descriptionSearchKeyword.toLowerCase());

            if (titleMatches && descriptionMatches) {
                currentTicket.displayTicket();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Count Tickets Matching Title and Description:");

        String titleCountKeyword = "not";
        String descriptionCountKeyword = "user";

        int matchingBothCount = 0;

        for (SupportTicket currentTicket : tickets) {

            boolean titleMatches =
                currentTicket.getTitle()
                    .toLowerCase()
                    .contains(titleCountKeyword.toLowerCase());

            boolean descriptionMatches =
                currentTicket.getDescription()
                    .toLowerCase()
                    .contains(descriptionCountKeyword.toLowerCase());

            if (titleMatches && descriptionMatches) {
                matchingBothCount++;
            }
        }

        System.out.println(
            "Tickets Matching Both Conditions: " + matchingBothCount
        );

        System.out.println();
        System.out.println("Highest-Priority Ticket Matching Keyword:");

        String priorityKeyword = "not";

        SupportTicket highestMatchingTicket = null;

        for (SupportTicket currentTicket : tickets) {

            boolean titleMatches =
                currentTicket.getTitle()
                    .toLowerCase()
                    .contains(priorityKeyword.toLowerCase());

            if (titleMatches &&
                (highestMatchingTicket == null ||
                currentTicket.getPriority().ordinal() >
                highestMatchingTicket.getPriority().ordinal())) {

                highestMatchingTicket = currentTicket;
            }
        }

        if (highestMatchingTicket != null) {
            highestMatchingTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Highest-Priority Active Ticket Matching Keyword:");

        String activePriorityKeyword = "not";

        SupportTicket highestActiveMatchingTicket = null;

        for (SupportTicket currentTicket : tickets) {

            boolean titleMatches =
                currentTicket.getTitle()
                    .toLowerCase()
                    .contains(activePriorityKeyword.toLowerCase());

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (titleMatches &&
                isActive &&
                (highestActiveMatchingTicket == null ||
                currentTicket.getPriority().ordinal() >
                highestActiveMatchingTicket.getPriority().ordinal())) {

                highestActiveMatchingTicket = currentTicket;
            }
        }

        if (highestActiveMatchingTicket != null) {
            highestActiveMatchingTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Lowest-Priority Ticket:");

        SupportTicket lowestPriorityTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (lowestPriorityTicket == null ||
                currentTicket.getPriority().ordinal() <
                lowestPriorityTicket.getPriority().ordinal()) {

                lowestPriorityTicket = currentTicket;
            }
        }

        if (lowestPriorityTicket != null) {
            lowestPriorityTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Lowest-Priority Active Ticket:");

        SupportTicket lowestPriorityActiveTicket = null;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (isActive &&
                (lowestPriorityActiveTicket == null ||
                currentTicket.getPriority().ordinal() <
                lowestPriorityActiveTicket.getPriority().ordinal())) {

                lowestPriorityActiveTicket = currentTicket;
            }
        }

        if (lowestPriorityActiveTicket != null) {
            lowestPriorityActiveTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Low-Priority Active Tickets:");

        int lowPriorityActiveCount = 0;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (isActive &&
                currentTicket.getPriority() == TicketPriority.LOW) {

                lowPriorityActiveCount++;
            }
        }

        System.out.println(
            "Low-Priority Active Tickets: " + lowPriorityActiveCount
        );

        System.out.println();
        System.out.println("Medium-Priority Active Tickets:");

        int mediumPriorityActiveCount = 0;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (isActive &&
                currentTicket.getPriority() == TicketPriority.MEDIUM) {

                mediumPriorityActiveCount++;
            }
        }

        System.out.println(
            "Medium-Priority Active Tickets: " + mediumPriorityActiveCount
        );

        System.out.println();
        System.out.println("High-Priority Tickets Assigned to Alex:");

        int alexHighPriorityCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Alex Johnson") &&
                currentTicket.getPriority() == TicketPriority.HIGH) {

                alexHighPriorityCount++;
            }
        }

        System.out.println(
            "High-Priority Tickets Assigned to Alex: "
            + alexHighPriorityCount
        );

        System.out.println();
        System.out.println("Low-Priority Tickets Assigned to Alex:");

        int alexLowPriorityCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Alex Johnson") &&
                currentTicket.getPriority() == TicketPriority.LOW) {

                alexLowPriorityCount++;
            }
        }

        System.out.println(
            "Low-Priority Tickets Assigned to Alex: "
            + alexLowPriorityCount
        );

        System.out.println();
        System.out.println("Active Tickets Assigned to Alex:");

        int alexActiveTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Alex Johnson") &&
                isActive) {

                alexActiveTicketCount++;
            }
        }

        System.out.println(
            "Active Tickets Assigned to Alex: "
            + alexActiveTicketCount
        );

        System.out.println();
        System.out.println("Highest-Priority Ticket Assigned to Alex:");

        SupportTicket alexHighestPriorityTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Alex Johnson")) {

                if (alexHighestPriorityTicket == null ||
                    currentTicket.getPriority().ordinal() >
                    alexHighestPriorityTicket.getPriority().ordinal()) {

                    alexHighestPriorityTicket = currentTicket;
                }
            }
        }

        if (alexHighestPriorityTicket != null) {
            alexHighestPriorityTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Lowest-Priority Ticket Assigned to Alex:");

        SupportTicket alexLowestPriorityTicket = null;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Alex Johnson")) {

                if (alexLowestPriorityTicket == null ||
                    currentTicket.getPriority().ordinal() <
                    alexLowestPriorityTicket.getPriority().ordinal()) {

                    alexLowestPriorityTicket = currentTicket;
                }
            }
        }

        if (alexLowestPriorityTicket != null) {
            alexLowestPriorityTicket.displayTicket();
        }

        System.out.println();
        System.out.println("Total Tickets Assigned to Alex:");

        int totalAlexTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Alex Johnson")) {

                totalAlexTicketCount++;
            }
        }

        System.out.println(
            "Total Tickets Assigned to Alex: "
            + totalAlexTicketCount
        );

        System.out.println();
        System.out.println("Active Tickets Assigned to Chris:");

        int chrisActiveTicketCount = 0;

        for (SupportTicket currentTicket : tickets) {

            boolean isActive =
                currentTicket.getStatus() == TicketStatus.OPEN ||
                currentTicket.getStatus() == TicketStatus.IN_PROGRESS;

            if (currentTicket.getAssignedUser() != null &&
                currentTicket.getAssignedUser().getName().equals("Chris Edwards") &&
                isActive) {

                chrisActiveTicketCount++;
            }
        }

        System.out.println(
            "Active Tickets Assigned to Chris: "
            + chrisActiveTicketCount
        );

        System.out.println();
        System.out.println("================================");
        System.out.println("   FINAL TICKET SUMMARY");
        System.out.println("================================");

        System.out.println("Total Tickets: " + tickets.size());
        System.out.println("Active Tickets: " + activeTicketCount);
        System.out.println("Unassigned Tickets: " + ticketsWithNoAssignment);
        System.out.println("Chris Edwards Tickets: " + chrisActiveTicketCount);
        System.out.println("Alex Johnson Tickets: " + totalAlexTicketCount);
        System.out.println("Highest Priority: " + mostCommonPriority);
        System.out.println("Most Common Status: " + mostCommonStatus);

        System.out.println("================================");
        
        }
    }