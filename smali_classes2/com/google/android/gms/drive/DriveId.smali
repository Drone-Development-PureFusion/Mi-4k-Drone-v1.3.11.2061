.class public Lcom/google/android/gms/drive/DriveId;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/DriveId;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I = -0x1

.field public static final b:I = 0x0

.field public static final c:I = 0x1


# instance fields
.field final d:I

.field final e:Ljava/lang/String;

.field final f:J

.field final g:J

.field final h:I

.field private volatile i:Ljava/lang/String;

.field private volatile j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/t;

    invoke-direct {v0}, Lcom/google/android/gms/drive/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/DriveId;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;JJI)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/DriveId;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/DriveId;->j:Ljava/lang/String;

    iput p1, p0, Lcom/google/android/gms/drive/DriveId;->d:I

    iput-object p2, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    if-nez p2, :cond_0

    const-wide/16 v4, -0x1

    cmp-long v0, p3, v4

    if-eqz v0, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    invoke-static {v2}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    iput-wide p3, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    iput-wide p5, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    iput p7, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    return-void

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;JJI)V
    .locals 10

    const/4 v2, 0x1

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    move/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/drive/DriveId;-><init>(ILjava/lang/String;JJI)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/drive/DriveId;
    .locals 7

    const-wide/16 v2, -0x1

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/drive/DriveId;

    const/4 v6, -0x1

    move-object v1, p0

    move-wide v4, v2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/DriveId;-><init>(Ljava/lang/String;JJI)V

    return-object v0
.end method

.method static a([B)Lcom/google/android/gms/drive/DriveId;
    .locals 9

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/aju;->a([B)Lcom/google/android/gms/internal/aju;
    :try_end_0
    .catch Lcom/google/android/gms/internal/rc; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const-string v1, ""

    iget-object v2, v0, Lcom/google/android/gms/internal/aju;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    :goto_0
    new-instance v1, Lcom/google/android/gms/drive/DriveId;

    iget v2, v0, Lcom/google/android/gms/internal/aju;->a:I

    iget-wide v4, v0, Lcom/google/android/gms/internal/aju;->c:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/aju;->d:J

    iget v8, v0, Lcom/google/android/gms/internal/aju;->e:I

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/drive/DriveId;-><init>(ILjava/lang/String;JJI)V

    return-object v1

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/aju;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Lcom/google/android/gms/drive/DriveId;
    .locals 4

    const-string v0, "DriveId:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Invalid DriveId: "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    const-string v0, "DriveId:"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/drive/DriveId;->a([B)Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private i()[B
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ajv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ajv;-><init>()V

    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/ajv;->a:J

    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/ajv;->b:J

    invoke-static {v0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    return v0
.end method

.method public c()Lcom/google/android/gms/drive/e;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This DriveId corresponds to a folder. Call asDriveFolder instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/internal/bv;

    invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/bv;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    return-object v0
.end method

.method public d()Lcom/google/android/gms/drive/f;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This DriveId corresponds to a file. Call asDriveFile instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/internal/bx;

    invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/bx;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    return-object v0
.end method

.method public e()Lcom/google/android/gms/drive/h;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/drive/DriveId;->d()Lcom/google/android/gms/drive/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/drive/DriveId;->c()Lcom/google/android/gms/drive/e;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/drive/internal/c;

    invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/c;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const-wide/16 v6, -0x1

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/drive/DriveId;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    check-cast p1, Lcom/google/android/gms/drive/DriveId;

    iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->g:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->f:J

    cmp-long v2, v2, v6

    if-nez v2, :cond_2

    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    cmp-long v2, v2, v6

    if-nez v2, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    if-nez v2, :cond_5

    :cond_3
    iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->f:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1

    :cond_5
    iget-wide v2, p1, Lcom/google/android/gms/drive/DriveId;->f:J

    iget-wide v4, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p1, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move v1, v0

    goto :goto_0

    :cond_6
    const-string v0, "DriveId"

    const-string v2, "Unexpected unequal resourceId for same DriveId object."

    invoke-static {v0, v2}, Lcom/google/android/gms/drive/internal/by;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/drive/DriveId;->h()[B

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DriveId:"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/drive/DriveId;->i:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->i:Ljava/lang/String;

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/drive/DriveId;->i()[B

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/DriveId;->j:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->j:Ljava/lang/String;

    return-object v0
.end method

.method final h()[B
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/aju;

    invoke-direct {v1}, Lcom/google/android/gms/internal/aju;-><init>()V

    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->d:I

    iput v0, v1, Lcom/google/android/gms/internal/aju;->a:I

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    iput-object v0, v1, Lcom/google/android/gms/internal/aju;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    iput-wide v2, v1, Lcom/google/android/gms/internal/aju;->c:J

    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    iput-wide v2, v1, Lcom/google/android/gms/internal/aju;->d:J

    iget v0, p0, Lcom/google/android/gms/drive/DriveId;->h:I

    iput v0, v1, Lcom/google/android/gms/internal/aju;->e:I

    invoke-static {v1}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/DriveId;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/drive/DriveId;->g:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/drive/DriveId;->f:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/drive/DriveId;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/t;->a(Lcom/google/android/gms/drive/DriveId;Landroid/os/Parcel;I)V

    return-void
.end method
