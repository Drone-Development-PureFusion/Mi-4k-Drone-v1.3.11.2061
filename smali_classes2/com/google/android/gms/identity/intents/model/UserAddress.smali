.class public final Lcom/google/android/gms/identity/intents/model/UserAddress;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/identity/intents/model/UserAddress;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Z

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field private final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/identity/intents/model/b;

    invoke-direct {v0}, Lcom/google/android/gms/identity/intents/model/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->p:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->p:I

    iput-object p2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->i:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->j:Ljava/lang/String;

    iput-object p12, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->k:Ljava/lang/String;

    iput-object p13, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->l:Ljava/lang/String;

    iput-boolean p14, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->m:Z

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->n:Ljava/lang/String;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->o:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/identity/intents/model/UserAddress;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "com.google.android.gms.identity.intents.EXTRA_ADDRESS"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    const-string v0, "com.google.android.gms.identity.intents.EXTRA_ADDRESS"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/identity/intents/model/UserAddress;

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->p:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->h:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->j:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->k:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->l:Ljava/lang/String;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->m:Z

    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->n:Ljava/lang/String;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->o:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/identity/intents/model/b;->a(Lcom/google/android/gms/identity/intents/model/UserAddress;Landroid/os/Parcel;I)V

    return-void
.end method
