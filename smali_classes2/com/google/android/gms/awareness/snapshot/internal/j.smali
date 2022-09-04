.class public Lcom/google/android/gms/awareness/snapshot/internal/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/awareness/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/g;Ljava/util/ArrayList;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/a;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2713

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;ILjava/util/ArrayList;)Lcom/google/android/gms/contextmanager/internal/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/awareness/snapshot/internal/j$6;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j$6;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method private static a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/j$7;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/awareness/snapshot/internal/j$7;-><init>(Lcom/google/android/gms/common/api/g;I)V

    return-object v0
.end method

.method private static a(Lcom/google/android/gms/common/api/g;ILjava/util/ArrayList;)Lcom/google/android/gms/contextmanager/internal/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;)",
            "Lcom/google/android/gms/contextmanager/internal/c$b;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/j$8;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/j$8;-><init>(Lcom/google/android/gms/common/api/g;ILjava/util/ArrayList;)V

    return-object v0
.end method

.method private static a(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ">;)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;"
        }
    .end annotation

    const-string v0, "beaconTypes cannot be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "beaconTypes must not be empty"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static varargs a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    const-string v0, "beaconTypes cannot be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "beaconTypes must not be empty"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, p0

    :goto_1
    if-ge v1, v3, :cond_1

    aget-object v0, p0, v1

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    return-object v2
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/b;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2712

    invoke-static {p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/awareness/snapshot/internal/j$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j$1;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/util/Collection;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ">;)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/a;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;Ljava/util/ArrayList;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public varargs a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/a;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;Ljava/util/ArrayList;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/c;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2714

    invoke-static {p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/awareness/snapshot/internal/j$2;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j$2;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method public c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/d;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2715

    invoke-static {p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/awareness/snapshot/internal/j$3;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j$3;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method public d(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/e;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2716

    invoke-static {p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/awareness/snapshot/internal/j$4;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j$4;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method public e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/f;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2717

    invoke-static {p1, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;->a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/contextmanager/internal/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/awareness/snapshot/internal/j$5;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/awareness/snapshot/internal/j$5;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method
