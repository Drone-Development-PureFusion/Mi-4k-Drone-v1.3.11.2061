.class public Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:I

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:I

.field private k:Lcom/google/android/gms/internal/ss;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/e;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->c:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->d:I

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->e:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->f:I

    iput p7, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->g:I

    iput-object p8, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->i:Ljava/lang/String;

    iput p10, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->j:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V
    .locals 11

    const/4 v1, 0x1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;
    .locals 10

    const/4 v7, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/android/gms/common/util/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x3

    const/4 v9, -0x1

    move-object v1, p1

    move-object v8, v7

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/awareness/b;)Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;
    .locals 10

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    invoke-virtual {p2}, Lcom/google/android/gms/awareness/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/android/gms/common/util/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p2}, Lcom/google/android/gms/awareness/b;->b()I

    move-result v6

    invoke-virtual {p2}, Lcom/google/android/gms/awareness/b;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Lcom/google/android/gms/awareness/b;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2}, Lcom/google/android/gms/awareness/b;->e()I

    move-result v9

    move-object v1, p1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/ss;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->k:Lcom/google/android/gms/internal/ss;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ss;

    iget-object v1, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ss;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->k:Lcom/google/android/gms/internal/ss;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->k:Lcom/google/android/gms/internal/ss;

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->d:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->f:I

    return v0
.end method

.method h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->g:I

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->j:I

    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->g:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "unknownPartyType"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "0P"

    goto :goto_0

    :pswitch_2
    const-string v0, "1P"

    goto :goto_0

    :pswitch_3
    const-string v0, "3P"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public m()[B
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;)[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->c()Lcom/google/android/gms/internal/ss;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->e()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->g()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->l()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->j()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, 0x64

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v9, "(account="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ", "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdPartyPackageName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,  thirdPartyModuleId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/e;->a(Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;Landroid/os/Parcel;I)V

    return-void
.end method
