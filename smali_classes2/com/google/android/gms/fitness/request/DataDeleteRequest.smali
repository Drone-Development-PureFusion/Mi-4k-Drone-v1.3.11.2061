.class public Lcom/google/android/gms/fitness/request/DataDeleteRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataDeleteRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:J

.field private final c:J

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Z

.field private final h:Z

.field private final i:Lcom/google/android/gms/internal/alq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/r;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/r;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLandroid/os/IBinder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;ZZ",
            "Landroid/os/IBinder;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->a:I

    iput-wide p2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    iput-wide p4, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    iput-object p8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    iput-boolean p9, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    iput-boolean p10, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    invoke-static {p11}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->i:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method public constructor <init>(JJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/google/android/gms/internal/alq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;ZZ",
            "Lcom/google/android/gms/internal/alq;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->a:I

    iput-wide p1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    iput-wide p3, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    iput-object p7, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    iput-boolean p8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    iput-boolean p9, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    iput-object p10, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->i:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)V
    .locals 12

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->a(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)J

    move-result-wide v2

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->b(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)J

    move-result-wide v4

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->c(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)Ljava/util/List;

    move-result-object v6

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->d(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)Ljava/util/List;

    move-result-object v7

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->e(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)Ljava/util/List;

    move-result-object v8

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->f(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)Z

    move-result v9

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;->g(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)Z

    move-result v10

    const/4 v11, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(JJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/google/android/gms/internal/alq;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;Lcom/google/android/gms/fitness/request/DataDeleteRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest;Lcom/google/android/gms/internal/alq;)V
    .locals 12

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    iget-wide v4, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    iget-object v6, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    iget-object v7, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    iget-object v8, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    iget-boolean v9, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    iget-boolean v10, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    move-object v1, p0

    move-object v11, p2

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(JJLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/google/android/gms/internal/alq;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->a(Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->a:I

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    return-wide v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    return-wide v0
.end method

.method public k()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->i:Lcom/google/android/gms/internal/alq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->i:Lcom/google/android/gms/internal/alq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "startTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "endTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataSources"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->d:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dateTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "sessions"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->f:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "deleteAllData"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->g:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "deleteAllSessions"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/r;->a(Lcom/google/android/gms/fitness/request/DataDeleteRequest;Landroid/os/Parcel;I)V

    return-void
.end method
