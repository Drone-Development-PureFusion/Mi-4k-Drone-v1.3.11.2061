.class public final Lcom/google/android/gms/wallet/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/e$a;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "com.google.android.gms.wallet.api.enabled"

.field public static final B:Landroid/accounts/Account;

.field public static final a:I = 0x1

.field public static final b:Ljava/lang/String; = "com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED"

.field public static final c:Ljava/lang/String; = "com.google.android.gms.wallet.EXTRA_MASKED_WALLET"

.field public static final d:Ljava/lang/String; = "com.google.android.gms.wallet.EXTRA_FULL_WALLET"

.field public static final e:Ljava/lang/String; = "com.google.android.gms.wallet.EXTRA_ERROR_CODE"

.field public static final f:Ljava/lang/String; = "com.google.android.gms.wallet.EXTRA_MASKED_WALLET_REQUEST"

.field public static final g:Ljava/lang/String; = "com.google.android.gms.wallet.EXTRA_IS_NEW_USER"

.field public static final h:Ljava/lang/String; = "com.google.android.gms.wallet.EXTRA_IS_READY_TO_PAY"

.field public static final i:I = 0x192

.field public static final j:I = 0x194

.field public static final k:I = 0x195

.field public static final l:I = 0x196

.field public static final m:I = 0x199

.field public static final n:I = 0x19a

.field public static final o:I = 0x19b

.field public static final p:I = 0x19c

.field public static final q:I = 0x19d

.field public static final r:I = 0x1

.field public static final s:I = 0x3

.field public static final t:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final u:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final v:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final w:I = 0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final x:I = 0x0

.field public static final y:I = 0x1

.field public static final z:Ljava/lang/String; = "com.google.android.gms.wallet.ENABLE_WALLET_OPTIMIZATION"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/accounts/Account;

    const-string v1, "ACCOUNT_NO_WALLET"

    const-string v2, "com.google"

    invoke-direct {v0, v1, v2}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/wallet/e;->B:Landroid/accounts/Account;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
