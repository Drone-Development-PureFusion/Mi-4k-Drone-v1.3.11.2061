.class public Lcom/google/android/gms/fitness/data/DataSource;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/data/DataSource$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Ljava/lang/String; = "vnd.google.fitness.data_source"

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field private static final d:[I


# instance fields
.field private final e:I

.field private final f:Lcom/google/android/gms/fitness/data/DataType;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Lcom/google/android/gms/fitness/data/Device;

.field private final j:Lcom/google/android/gms/fitness/data/Application;

.field private final k:Ljava/lang/String;

.field private final l:[I

.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/fitness/data/DataSource;->d:[I

    new-instance v0, Lcom/google/android/gms/fitness/data/n;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/DataSource;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;ILcom/google/android/gms/fitness/data/Device;Lcom/google/android/gms/fitness/data/Application;Ljava/lang/String;[I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/DataSource;->e:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/data/DataSource;->f:Lcom/google/android/gms/fitness/data/DataType;

    iput p4, p0, Lcom/google/android/gms/fitness/data/DataSource;->h:I

    iput-object p3, p0, Lcom/google/android/gms/fitness/data/DataSource;->g:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    iput-object p6, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    iput-object p7, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataSource;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->m:Ljava/lang/String;

    if-eqz p8, :cond_0

    :goto_0
    iput-object p8, p0, Lcom/google/android/gms/fitness/data/DataSource;->l:[I

    return-void

    :cond_0
    sget-object p8, Lcom/google/android/gms/fitness/data/DataSource;->d:[I

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/data/DataSource$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->e:I

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->a(Lcom/google/android/gms/fitness/data/DataSource$a;)Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->f:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->b(Lcom/google/android/gms/fitness/data/DataSource$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->h:I

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->c(Lcom/google/android/gms/fitness/data/DataSource$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->d(Lcom/google/android/gms/fitness/data/DataSource$a;)Lcom/google/android/gms/fitness/data/Device;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->e(Lcom/google/android/gms/fitness/data/DataSource$a;)Lcom/google/android/gms/fitness/data/Application;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->f(Lcom/google/android/gms/fitness/data/DataSource$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataSource;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->m:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataSource$a;->g(Lcom/google/android/gms/fitness/data/DataSource$a;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->l:[I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/data/DataSource$a;Lcom/google/android/gms/fitness/data/DataSource$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataSource;-><init>(Lcom/google/android/gms/fitness/data/DataSource$a;)V

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "vnd.google.fitness.data_source"

    sget-object v1, Lcom/google/android/gms/fitness/data/DataSource;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    goto :goto_0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid type value"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v0, "r"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "d"

    goto :goto_0

    :pswitch_2
    const-string v0, "c"

    goto :goto_0

    :pswitch_3
    const-string v0, "v"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private a(Lcom/google/android/gms/fitness/data/DataSource;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->m:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataSource;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 3

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid data quality standard value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v0, "blood_pressure_esh2002"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "blood_pressure_esh2010"

    goto :goto_0

    :pswitch_2
    const-string v0, "blood_pressure_aami"

    goto :goto_0

    :pswitch_3
    const-string v0, "blood_pressure_bhs_a_a"

    goto :goto_0

    :pswitch_4
    const-string v0, "blood_pressure_bhs_a_b"

    goto :goto_0

    :pswitch_5
    const-string v0, "blood_pressure_bhs_b_a"

    goto :goto_0

    :pswitch_6
    const-string v0, "blood_pressure_bhs_b_b"

    goto :goto_0

    :pswitch_7
    const-string v0, "blood_glucose_iso151972003"

    goto :goto_0

    :pswitch_8
    const-string v0, "blood_glucose_iso151972013"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private l()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataSource;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->f:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/DataType;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    if-eqz v1, :cond_0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/Application;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    if-eqz v1, :cond_1

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/Device;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private m()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->h:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid type value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v0, "raw"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "derived"

    goto :goto_0

    :pswitch_2
    const-string v0, "cleaned"

    goto :goto_0

    :pswitch_3
    const-string v0, "converted"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->f:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->h:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->g:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Application;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Lcom/google/android/gms/fitness/data/Application;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/DataSource;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataSource;->a(Lcom/google/android/gms/fitness/data/DataSource;)Z

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

.method public f()Lcom/google/android/gms/fitness/data/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    return-object v0
.end method

.method public h()[I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->l:[I

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->m:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->h:I

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSource;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->f:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Device;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/Device;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, ":"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ":"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    if-eqz v2, :cond_5

    const-string v5, ":"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ":"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    sget-object v1, Lcom/google/android/gms/fitness/data/Application;->a:Lcom/google/android/gms/fitness/data/Application;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Application;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ":gms"

    goto/16 :goto_0

    :cond_1
    const-string v1, ":"

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Application;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    const-string v1, ""

    goto/16 :goto_1

    :cond_4
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    const-string v2, ""

    goto/16 :goto_2
.end method

.method k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DataSource{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataSource;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->g:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    if-eqz v1, :cond_1

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->j:Lcom/google/android/gms/fitness/data/Application;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    if-eqz v1, :cond_2

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->i:Lcom/google/android/gms/fitness/data/Device;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSource;->f:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/n;->a(Lcom/google/android/gms/fitness/data/DataSource;Landroid/os/Parcel;I)V

    return-void
.end method
