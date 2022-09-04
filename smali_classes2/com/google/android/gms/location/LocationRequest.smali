.class public final Lcom/google/android/gms/location/LocationRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/location/m;

.field public static final a:I = 0x64

.field public static final b:I = 0x66

.field public static final c:I = 0x68

.field public static final d:I = 0x69


# instance fields
.field e:I

.field f:J

.field g:J

.field h:Z

.field i:J

.field j:I

.field k:F

.field l:J

.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/m;

    invoke-direct {v0}, Lcom/google/android/gms/location/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Lcom/google/android/gms/location/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    const/16 v0, 0x66

    iput v0, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    const-wide/32 v0, 0x36ee80

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    const-wide/32 v0, 0x927c0

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:Z

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/location/LocationRequest;->k:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    return-void
.end method

.method constructor <init>(IIJJZJIFJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    iput p2, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    iput-wide p3, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    iput-wide p5, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    iput-boolean p7, p0, Lcom/google/android/gms/location/LocationRequest;->h:Z

    iput-wide p8, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    iput p10, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    iput p11, p0, Lcom/google/android/gms/location/LocationRequest;->k:F

    iput-wide p12, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    return-void
.end method

.method public static a()Lcom/google/android/gms/location/LocationRequest;
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    return-object v0
.end method

.method private static b(F)V
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x25

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid displacement: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public static c(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "???"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "PRIORITY_HIGH_ACCURACY"

    goto :goto_0

    :pswitch_2
    const-string v0, "PRIORITY_BALANCED_POWER_ACCURACY"

    goto :goto_0

    :pswitch_3
    const-string v0, "PRIORITY_LOW_POWER"

    goto :goto_0

    :pswitch_4
    const-string v0, "PRIORITY_NO_POWER"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static d(I)V
    .locals 3

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid quality: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static f(J)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x26

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid interval: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(F)Lcom/google/android/gms/location/LocationRequest;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/location/LocationRequest;->b(F)V

    iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->k:F

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/location/LocationRequest;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/location/LocationRequest;->d(I)V

    iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    return-object p0
.end method

.method public a(J)Lcom/google/android/gms/location/LocationRequest;
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->f(J)V

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    long-to-double v0, v0

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    div-double/2addr v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    :cond_0
    return-object p0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    return v0
.end method

.method public b(I)Lcom/google/android/gms/location/LocationRequest;
    .locals 3

    if-gtz p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid numUpdates: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    return-object p0
.end method

.method public b(J)Lcom/google/android/gms/location/LocationRequest;
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->f(J)V

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    return-object p0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    return-wide v0
.end method

.method public c(J)Lcom/google/android/gms/location/LocationRequest;
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->f(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->h:Z

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    return-object p0
.end method

.method public d()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    :cond_0
    return-wide v0
.end method

.method public d(J)Lcom/google/android/gms/location/LocationRequest;
    .locals 9

    const-wide v6, 0x7fffffffffffffffL

    const-wide/16 v4, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v2, v6, v0

    cmp-long v2, p1, v2

    if-lez v2, :cond_1

    iput-wide v6, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_0

    iput-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    :cond_0
    return-object p0

    :cond_1
    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    goto :goto_0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    return-wide v0
.end method

.method public e(J)Lcom/google/android/gms/location/LocationRequest;
    .locals 5

    const-wide/16 v2, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iput-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    :cond_0
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/location/LocationRequest;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/LocationRequest;

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    iget v3, p1, Lcom/google/android/gms/location/LocationRequest;->e:I

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->f:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->g:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/location/LocationRequest;->h:Z

    iget-boolean v3, p1, Lcom/google/android/gms/location/LocationRequest;->h:Z

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->i:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    iget v3, p1, Lcom/google/android/gms/location/LocationRequest;->j:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->k:F

    iget v3, p1, Lcom/google/android/gms/location/LocationRequest;->k:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->k:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/google/android/gms/location/LocationRequest;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->k:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->m:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    invoke-static {v2}, Lcom/google/android/gms/location/LocationRequest;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/location/LocationRequest;->e:I

    const/16 v2, 0x69

    if-eq v1, v2, :cond_0

    const-string v1, " requested="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " fastest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->g:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->f:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    const-string v1, " maxWait="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->l:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v1, v2, v4

    if-eqz v1, :cond_2

    iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->i:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-string v1, " expireIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget v1, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_3

    const-string v1, " num="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_3
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/m;->a(Lcom/google/android/gms/location/LocationRequest;Landroid/os/Parcel;I)V

    return-void
.end method
