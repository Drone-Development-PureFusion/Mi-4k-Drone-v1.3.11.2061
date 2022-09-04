.class public Lcom/google/android/gms/contextmanager/fence/internal/d;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/px;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/px;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/px;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/d;->a:Lcom/google/android/gms/internal/px;

    return-void
.end method

.method public static a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/contextmanager/fence/internal/d;
    .locals 4

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/d;

    const/4 v1, 0x1

    const-wide/16 v2, 0xbb8

    invoke-static {v1, p0, v2, v3}, Lcom/google/android/gms/contextmanager/fence/internal/d;->a(I[Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;J)Lcom/google/android/gms/internal/px;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/d;-><init>(Lcom/google/android/gms/internal/px;)V

    return-object v0
.end method

.method private static a(I[Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;J)Lcom/google/android/gms/internal/px;
    .locals 6

    const/4 v0, 0x0

    new-instance v3, Lcom/google/android/gms/internal/px;

    invoke-direct {v3}, Lcom/google/android/gms/internal/px;-><init>()V

    iput p0, v3, Lcom/google/android/gms/internal/px;->a:I

    if-eqz p1, :cond_0

    array-length v1, p1

    if-eqz v1, :cond_0

    array-length v1, p1

    new-array v1, v1, [Lcom/google/android/gms/internal/px$a;

    iput-object v1, v3, Lcom/google/android/gms/internal/px;->c:[Lcom/google/android/gms/internal/px$a;

    array-length v4, p1

    move v1, v0

    move v2, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v0, p1, v1

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    iget-object v5, v3, Lcom/google/android/gms/internal/px;->c:[Lcom/google/android/gms/internal/px$a;

    invoke-virtual {v0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->d()Lcom/google/android/gms/internal/px$a;

    move-result-object v0

    aput-object v0, v5, v2

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iput-wide p2, v3, Lcom/google/android/gms/internal/px;->b:J

    return-object v3
.end method

.method public static b([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/contextmanager/fence/internal/d;
    .locals 4

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/d;

    const/4 v1, 0x2

    const-wide/16 v2, 0xbb8

    invoke-static {v1, p0, v2, v3}, Lcom/google/android/gms/contextmanager/fence/internal/d;->a(I[Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;J)Lcom/google/android/gms/internal/px;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/d;-><init>(Lcom/google/android/gms/internal/px;)V

    return-object v0
.end method

.method public static c([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/contextmanager/fence/internal/d;
    .locals 4

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/d;

    const/4 v1, 0x3

    const-wide/16 v2, 0xbb8

    invoke-static {v1, p0, v2, v3}, Lcom/google/android/gms/contextmanager/fence/internal/d;->a(I[Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;J)Lcom/google/android/gms/internal/px;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/d;-><init>(Lcom/google/android/gms/internal/px;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/px;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/d;->a:Lcom/google/android/gms/internal/px;

    return-object v0
.end method
